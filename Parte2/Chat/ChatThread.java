import java.net.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatThread extends Thread {
    protected static int lmess = 256; // Massima lunghezza di un messaggio
    protected static int lnome = 16; // Massima lunghezza per il nick di un utente
    protected static char separatore = '\n';
    protected static int pausa;
    protected static ChatServer cs;
    protected Socket s;
    protected DataInputStream i;
    protected DataOutputStream o;
    protected String nome = "";

    protected static Vector<ChatThread> threads = new Vector();
    protected static String elenconomi = "" + separatore;

    /*
     * i campi statici sono campi di classe e quindi comuni a tutte le istanze che
     * vengono
     * create
     */
    public ChatThread(Socket s, ChatServer cs, int pausa) {
        this.s = s;
        this.cs = cs;
        this.pausa = pausa;
        try {
            i = new DataInputStream(new BufferedInputStream(s.getInputStream()));
            o = new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    protected void ferma() {
        cs.decrementaUtenti();
        synchronized (threads) {
            threads.removeElement(this);
            elenconomi = "" + separatore;
            for (ChatThread e : threads) {
                elenconomi = elenconomi + e.nome + separatore;
            }
        }
        trasmetti(nome + " è uscito dalla chat.", "Tutti", true);
        try {
            s.close();
        } catch (IOException ex) {
        }
    }

    public void run() {
        try { // legge il nuovo nome
            while (nome == "") {
                nome = i.readUTF();
                if ((nome.length() > lnome) || (nome.indexOf(separatore) != -1)) {
                    ferma();
                    return;
                }
            }
            synchronized (threads) { // aggiunge il nuovo thread
                while (elenconomi.indexOf(separatore + nome + separatore) != -1) {
                    nome += "*";
                }
                // evita nomi duplicati: se uno si aggiunge con lo stesso nome di una persona
                // già presente aggiunge al nome tanti asterischi fino a che il nome
                // diventa diverso da tutti gli altri
                elenconomi += nome + separatore;
                threads.addElement(this);
            }
            o.writeUTF(nome);
            o.flush();
            System.out.println(nome);
            trasmetti(nome + " si è unito alla chat.", "Tutti", true);
            while (true) { // si mette in ascolto sul canale di input
                String msg = i.readUTF(); // destinatario\ntesto
                int pos = msg.indexOf(separatore) + 1;
                if ((msg.length() <= lmess) &&
                        (pos != 0) && (msg.indexOf(separatore, pos) == -1)) {
                    trasmetti(nome + "> " + msg.substring(pos, msg.length()),
                            msg.substring(0, pos - 1), false);
                }
                try {
                    sleep(pausa);
                } catch (InterruptedException ex) {
                }
            }
        } catch (IOException ecc) {
            ferma();
            return;
        }
    }

    protected void trasmetti(String messaggio, String destinatario,
            boolean trasmettiElenco) {
        synchronized (threads) {
            for (ChatThread e : threads) {
                if (((e.nome.equals(destinatario)) ||
                        (destinatario.equals("Tutti"))) && ((e != this) || trasmettiElenco)) {
                    try {
                        if (trasmettiElenco) {
                            e.o.writeUTF(messaggio + elenconomi);
                        } else {
                            e.o.writeUTF(messaggio);
                        }
                        e.o.flush();
                    } catch (IOException ex) {
                        e.ferma();
                        e.interrupt();
                    }
                }
            }
        }
    }
}
