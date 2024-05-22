import java.io.*;
import java.net.*;
import java.util.Random;

public class Client{
    public static void main(String[] args) {
        String addr = "localhost";
        int port = 6564;
        try{
            Socket conn = new Socket(addr, port);
            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
            Random r = new Random();
            int n = r.nextInt(100);
            for(int i = 0; i < n; i++){
                String messaggio = "";
                int m = r.nextInt(15);
                for (int j = 0; j < m; j++) {
                    messaggio += "ciao";
                }
                out.writeUTF(messaggio);
            }
            out.flush();
            out.writeUTF("Bye");
            out.close();
            conn.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}