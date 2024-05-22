import java.io.*;
import java.net.*;
import java.util.Random;


public class Client{
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3000);
            PrintWriter out = new PrintWriter(s.getOutputStream());
            System.out.println("Inizio trasmissione");
            Random r = new Random();
            int N = r.nextInt(30);
            for(int i = 0; i < N; i++){
                out.println(r.nextInt(50));
            }
            out.flush();
            out.println(-1);
            out.close();
            s.close();
            System.out.println("Fine trasmissione");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}