import java.net.*;
import java.io.*;

public class ServerThread extends Thread {
    Socket soc = null;
    Cont cont = null;

    public ServerThread(Socket s, Cont c) {
        soc = s;
        cont = c;
    }

    public void run() {
        int inp = 0;
        try {

            DataInputStream in = new DataInputStream(soc.getInputStream());
            while ((inp = in.readInt()) != -1) {
                cont.aggiorna(inp);
            }
            System.out.println("Numero input divisibili per " + cont.M + ": " + cont.cont);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}