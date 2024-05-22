import java.io.DataInputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    Socket soc;
    public ServerThread(Socket soc){
        this.soc = soc;
    }

    
    public void run() {
        int max = 0;
        try {
            DataInputStream in = new DataInputStream(soc.getInputStream());
            String inp = "";
            while ((inp = in.readUTF()) != null) {
                if (inp.equals("Bye")) {
                    break;
                }
                if (inp.length() > max) {
                    max = inp.length();
                    Server.m.aggiorna(max);
                }
            }
            System.out.println("Lunghezza massima di questa con questa connessione: "  + max);
            System.out.println("Lunghezza massima assoluta: " + Server.m.getMax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}