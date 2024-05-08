import java.io.*;
import java.net.*;
public class ExactTime{
    public static void main(String[] args) {
        try{
            Socket s1 = new Socket("time", 443);
            BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            boolean continua = true;
            while (continua) {
                String line = in.readLine();
                if(line== null)continua = false;
                else System.out.println(line);
            }
            s1.close();
        }catch(IOException e){}
    }
}