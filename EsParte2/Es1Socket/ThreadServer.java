import java.net.*;
import java.io.*;

public class ThreadServer extends Thread{
    Socket soc = null;
    public ThreadServer(Socket s){
        soc = s;
    }

    public void run(){
        String maxStringLoc = "";
        String mess = null;
        try{
            //BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            DataInputStream in = new DataInputStream(soc.getInputStream());
            while ((mess = in.readUTF())!=null) {
                System.out.println("Client: " + mess.trim());
                if (mess.trim().equals("Bye")) {
                    System.out.println("Connessione terminata");
                    break;
                }else{
                    if (mess.trim().length()>maxStringLoc.length()) {
                        maxStringLoc = mess.trim();
                    }
                }
            }
            System.out.println("Stringa di lunghezza massima in questo thread = " + maxStringLoc);
            MaxLung.aggiorna(maxStringLoc);
            System.out.println("Stringa di lunghezza massima in assoluto: " + MaxLung.SMax);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}