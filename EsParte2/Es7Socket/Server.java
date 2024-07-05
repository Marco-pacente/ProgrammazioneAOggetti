import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket serv = new ServerSocket(3000);
            while(true){
                new ServerThread(serv.accept()).start();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}