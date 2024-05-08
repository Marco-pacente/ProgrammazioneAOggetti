import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 10912);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}