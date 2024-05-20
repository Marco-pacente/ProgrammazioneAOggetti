import java.net.*;
public class Server{
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(8100);
            while (true) {
                ThreadServer ts = new ThreadServer(server.accept());
                ts.start();            
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}