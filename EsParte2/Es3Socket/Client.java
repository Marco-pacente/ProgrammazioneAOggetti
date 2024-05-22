import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        String addr = "localhost";
        int port = 8100;

        

        try{
            Socket soc = new Socket(addr, port);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int cont = 0;
            String inp;
            while ((inp = in.readLine())!=null) {
                if (inp.equals("Bye")) {
                    break;
                }
                cont += inp.length();
            }
            System.out.println("lunghezza = " + cont);
            soc.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return;
        }

    }
}