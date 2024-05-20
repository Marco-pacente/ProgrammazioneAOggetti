import java.io.*;
import java.net.*;

public class ServerThread extends Thread {
    String str = null;
    Socket soc = null;
    public ServerThread(Socket soc, String str){
        this.str = str;
        this.soc = soc;
    }

    public void run() {
        String mess = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()))){
            while ((mess = br.readLine())!= null) {
                System.out.println("Client: " + mess.trim());
                if (mess.trim().equals("Bye")) {
                    break;
                }
                if (mess.equals(Server.stringaY)) {
                    Server.aggiorna();
                }
            }
            System.out.println("Client disconnesso");
            System.out.println("Numero di stringhe uguali a " + Server.stringaY + ": " + Server.cont);
            br.close();
            soc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}