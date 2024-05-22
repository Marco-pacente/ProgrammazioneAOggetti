import java.net.*;
import java.util.Random;
public class Server {
    public static int M;
    public static int nValoriUgualiM = 0;
    public static int getM() {
        return M;
    }
    public synchronized static void aggiorna(){
        nValoriUgualiM++;
    }
    public static void main(String[] args) {
        M = new Random().nextInt(30);
        try {
            ServerSocket s = new ServerSocket(3000);
            while (true) {
                new ServerThread(s.accept()).start();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}