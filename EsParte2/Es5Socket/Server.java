import java.net.*;

public class Server{
    public static void main(String[] args) {
        try {
            ServerSocket soc = new ServerSocket(4321);
            Cont c = new Cont();
            while (true) {
                new ServerThread(soc.accept(), c).start();                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}