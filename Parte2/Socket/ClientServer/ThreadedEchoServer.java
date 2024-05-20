import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedEchoServer {
    public static void main(String[] args) {
        int i = 1;
        try{
            ServerSocket s = new ServerSocket(10913);
            while (true) {
                Socket incoming = s.accept();
                System.out.println("Nuova connessione: " + i);
                new ThreadedEchoHandler(incoming, i).start();
                i++;
            }
        }catch(Exception e){}
    }
}
