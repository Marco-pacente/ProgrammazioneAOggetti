import java.io.*;
import java.net.*;
import java.util.Random;
public class ServerThread extends Thread{
    Socket s;
    public ServerThread(Socket s){
        this.s = s;
    }
    public void run(){
        try{
            PrintWriter out = new PrintWriter(s.getOutputStream());
            int N = new Random().nextInt(50);
            for(int i = 0; i < N; i++){
                out.println("stringa" + i);
                out.flush();
            }
            out.println("Bye");
            out.flush();
            out.close();
            s.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}