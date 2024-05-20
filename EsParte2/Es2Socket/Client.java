import java.net.*;
import java.util.Random;
import java.io.*;

public class Client{
    public static void main(String[] args) {
        String indirizzo = "localhost";
        int porta = 10000;
        if (args.length > 0) {
           indirizzo = args[0]; 
        }
        if (args.length > 1) {
            porta = Integer.parseInt(args[1]);
        }

        try(
            Socket soc = new Socket(indirizzo, porta);
            PrintWriter out = new PrintWriter(soc.getOutputStream()); 
        ){
            Random rand = new Random();
            int N = rand.nextInt(20);
            String s;
            for (int i = 0; i < N; i++) {
                s = "stringa" + rand.nextInt(10);
                System.out.println("Inviato: " + s);
                out.println(s);
            }
            out.flush();
            out.println("Bye");
            out.flush();
            out.close();
            soc.close();
        }catch(UnknownHostException e){
            System.out.println(e.getMessage());
            return;
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}