import java.io.*;
import java.net.*;
import java.util.Random;
public class Client{
    public static void main(String[] args) {
        Random rand = new Random();
        try{
            Socket s = new Socket("localhost", 8100);
            //PrintWriter wr = new PrintWriter(s.getOutputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            String hello = "";
            int N = rand.nextInt(20);
            int M;
            for(int j = 0; j < N; j++){
                hello = "";
                M = rand.nextInt(10);
                for (int i = 0; i < M; i++) {
                    hello += "ciao";
                }
                System.out.println("Inviato: " + hello);
                System.out.println("Lunghezza: " + hello.length());
                out.writeUTF(hello);
            }
            out.writeUTF("Bye");
            out.flush();
            s.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}