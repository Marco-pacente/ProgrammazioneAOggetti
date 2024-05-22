import java.net.*;
import java.io.*;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 4321);
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            Random r = new Random();
            int N = r.nextInt(20);
            int num;
            for(int i = 0; i < N; i++){
                num = r.nextInt(100);
                System.out.println(num);
                out.writeInt(num);
                out.flush();
            }
            System.out.println(-1);
            out.writeInt(-1);
            out.flush();
            out.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}