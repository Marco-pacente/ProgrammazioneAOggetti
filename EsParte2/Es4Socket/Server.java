import java.net.ServerSocket;

public class Server {
    static Massimo m = new Massimo();

    public static void main(String[] args) {
        try {
            ServerSocket serv = new ServerSocket(6564);
            while (true) {
                new ServerThread(serv.accept()).start();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
