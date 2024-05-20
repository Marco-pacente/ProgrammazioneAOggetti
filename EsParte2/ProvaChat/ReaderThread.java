import java.net.*;
import java.io.*;
public class ReaderThread extends Thread{
    Socket soc = null;
    public ReaderThread(Socket soc){
        super();
        this.soc = soc;
    }
    
    public void run() {
        String mess = null;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            while (Client.conn) {
                mess = in.readLine().trim();
                if (mess.toLowerCase().equals("bye")) {
                    System.out.println("connessione chiusa");
                    Client.conn = true;
                    continue;
                }
                System.out.println("Received: " + mess);
            }
        } catch (IOException e) {
            System.out.println("UH");
            return;
        }
    }
}