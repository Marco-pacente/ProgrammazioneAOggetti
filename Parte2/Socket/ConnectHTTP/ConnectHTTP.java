import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnectHTTP{
    public static void main(String[] args) {
        try {
            String nome;
            int porta;
            if(args.length == 0){
                nome = "www.unipg.it";
            }else{
                nome = args[0];
            }
            if(args.length > 1){
                porta = 80;
            }else{
                porta = Integer.parseInt(args[1]);
            }
            
            Socket s = new Socket(nome , porta);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            out.println("GET /HTTP/\1.1");
            out.println("Accept: text/html");
            out.println("Host: " + nome);
            out.println("");

            boolean more = true;
            while(more){
                String line = in.readLine();
                if (line == null) {
                    more = false;
                }else{
                    System.out.println(line);
                }
            }
            try{
                s.close();
            }catch(Exception e){}

        } catch (Exception e) {}
    }
}