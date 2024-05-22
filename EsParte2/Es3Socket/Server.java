import java.io.*;
import java.net.*;
import java.util.Random;
public class Server {
    public static int N;
    public static void main(String[] args) {
        Random r = new Random();
        N = r.nextInt(20);
        try{
            ServerSocket serv = new ServerSocket(8100);
            while (true) {
                Socket soc = serv.accept();
                System.out.println("Nuova connessione");
                ServerThread t = new ServerThread(soc);
                t.start();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
            return;
        }
    }
}
