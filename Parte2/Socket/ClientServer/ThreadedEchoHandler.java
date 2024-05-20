import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
public class ThreadedEchoHandler extends Thread{
    Socket s;
    int i;
    public ThreadedEchoHandler(Socket s, int i){
        this.s = s;
        this.i = i;
    }
    public void run(){
        System.out.println("client connesso");
        try {
            
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                
            out.println("Helo");
                
            boolean done = false;
            while(!done){
                String line = in.readLine();
                if (line == null) {
                    done = true;
                }else if (line.trim().toLowerCase().equals("bye")) {
                    done = true;
                    out.println("Bye");                        
                }else if (line.trim().toLowerCase().equals("helo")) {
                    out.println("Helo");
                }else{
                    out.println("Bro did "+line.trim());
                }
                
            }
            s.close();
            System.out.println("Client " + i + " disconnesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
