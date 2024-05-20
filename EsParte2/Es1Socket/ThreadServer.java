import java.net.*;
import java.io.*;

public class ThreadServer extends Thread{
    Socket soc = null;
    public ThreadServer(Socket s){
        super();
        soc = s;
    }

    public void run(){
        int maxLungLoc = 0;
        String mess = null;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            while ((mess = br.readLine())!=null) {
                System.out.println("Client: " + mess.trim());
                if (mess.trim().equals("Bye")) {
                    System.out.println("Connessione terminata");
                    break;
                }else{
                    if (mess.trim().length()>maxLungLoc) {
                        maxLungLoc = mess.trim().length();
                    }
                }
            }
            System.out.println("Massima lunghezza in questo thread = " + maxLungLoc);
            MaxLung.aggiorna(maxLungLoc);
            System.out.println("Massima lunghezza in assoluto: " + MaxLung.max);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}