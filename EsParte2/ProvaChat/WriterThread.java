import java.io.*;
import java.net.*;

public class WriterThread extends Thread{
    Socket soc = null;
    public WriterThread(Socket soc){
        this.soc = soc;
    }

    public void run() {
        BufferedReader in = null;
        BufferedWriter out = null;
        try{
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
        }catch(IOException e){
            System.out.println(e.getMessage());
            Client.conn = false;
        }
        String mess = null;
        while (Client.conn) {
            try{
                mess = in.readLine();
                if (mess.trim().toLowerCase().equals("bye")) {
                    Client.conn = false;
                }
                out.write(mess + "\n");
                out.flush();
            }catch(Exception e){
                System.out.println();
                Client.conn = false;
                return;
            }
            System.out.println("connessione terminata");
        }
    }
}