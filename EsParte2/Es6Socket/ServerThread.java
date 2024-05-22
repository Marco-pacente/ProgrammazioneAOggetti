import java.io.*;
import java.net.*;

public class ServerThread extends Thread {
    Socket s = null;
    public ServerThread(Socket s){
        this.s = s;
    }

    public void run(){
        int n;
        int M = Server.getM();
        int max = 0;

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            while(true){
                n = Integer.parseInt(in.readLine());
                System.out.println(n);
                if (n == -1) {
                    break;
                }
                if (n == M) {
                    Server.aggiorna();
                }else{
                    if (n > max) {
                        max = n;
                    }
                }
            }
            s.close();
            in.close();

            System.out.println("Massimo dei valori diversi da " + M + ": " + max);
            System.out.println("Numero di valori uguali a " + M + " finora: " + Server.nValoriUgualiM);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}