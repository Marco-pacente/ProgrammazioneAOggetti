import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Server{
    public static void main(String[] args) {
        try{
            ServerSocket s = new ServerSocket(10912);
            while (true) {
                Socket incoming = s.accept();
                System.out.println("client connesso");
                BufferedReader in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
                
                PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);
                
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
                incoming.close();
            }

        }catch(Exception e){}
    }
}