import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost", 3000);
            System.out.println("connesso");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String s = null;
            int cont = 0;
            double med = 0; 
            while ((s = in.readLine().trim()) != null) {
                System.out.println(s);
                cont++;
                med += s.length();
                if (s.equals("Bye")) {
                    break;
                }
            }
            med /= cont;
            System.out.println("Media = " + med);
            soc.close();
        }catch(ArithmeticException e){
            System.out.println("Media = 0");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}