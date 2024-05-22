import java.net.*;
import java.io.*;

public class ServerThread extends Thread {
    Socket soc;
    public ServerThread(Socket s){
        soc = s;
    }
    
    public void run() {
        
        try {
            PrintWriter out = new PrintWriter(soc.getOutputStream());
            for (int i = 0; i < Server.N; i++) {
                out.println("stringa" + (i+1));
                out.flush();
            }
            System.out.println("Bye");
            out.println("Bye");
            out.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}