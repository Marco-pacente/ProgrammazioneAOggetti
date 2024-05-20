import java.net.Socket;

public class Client{
    public static volatile boolean conn;
    public static void main(String[] args) {
        String addr = "localhost";
        int recPort, sendPort;
        Socket send, recv;
        try{
            addr = args[0];
            recPort = Integer.parseInt(args[1]);
            sendPort = Integer.parseInt(args[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Uso corretto: java Client [indirizzo] [porta1] [porta2]");
            return;
        }
        conn = true;
        try {
            send = new Socket(addr, sendPort);
            recv = new Socket(addr, recPort);
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            return;
        }
        new ReaderThread(recv).start();
        new WriterThread(send).start();


    }
}