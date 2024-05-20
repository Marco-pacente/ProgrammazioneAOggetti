import java.net.*;
import java.util.Random;
public class Server {
    public static String stringaY;
    static int cont = 0;
    public static synchronized void aggiorna(){
        cont++;
    }
    public static void main(String[] args) {
        stringaY = ("stringa" + new Random().nextInt(10));
        try(ServerSocket serv = new ServerSocket(10000);){
            while (true) {
                new ServerThread(serv.accept(), stringaY).start();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return;
        }
    }
}