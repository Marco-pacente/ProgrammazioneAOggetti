import java.io.*;
import java.net.*;
import java.util.Random;
public class Client{
    public static void main(String[] args) {
        Random rand = new Random();
        try{
            Socket s = new Socket("localhost", 8100);
            PrintWriter wr = new PrintWriter(s.getOutputStream());
            
            String hello = "";
            for(int j = 0; j < rand.nextInt(20); j++){
                for (int i = 0; i < rand.nextInt(10); i++) {
                    hello += "ciao";
                }
                System.out.println("Inviato: " + hello);
                System.out.println("Lunghezza: " + hello.length());
                wr.println(hello);
            }
            wr.println("Bye");
            wr.flush();
            s.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}