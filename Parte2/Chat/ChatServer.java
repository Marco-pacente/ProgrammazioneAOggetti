import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServer {
    protected int utentiConnessi = 0;

    public ChatServer(int porta, int utenti, int pausa) throws IOException,
            InterruptedException {
        ServerSocket server = new ServerSocket(porta);
        // ChatThread.pausa = pausa;
        // ChatThread.cs = this;
        while (true) {
            if ((utentiConnessi < utenti) || (utenti == 0)) {
                Socket client = server.accept();
                System.out.println(client.getInetAddress());
                ChatThread c = new ChatThread(client, this, pausa);
                c.start();
                synchronized (this) {
                    utentiConnessi++;
                }
            } else
                Thread.sleep(1000);
        }
    }

    synchronized public void decrementaUtenti() {
        utentiConnessi--;
    }

    // public void decrementaUtenti() {synchronized(this) {utentiConnessi--;}}
    public static void main(String args[]) throws IOException, InterruptedException {
        if (args.length < 1)
            new ChatServer(3000, 0, 0);
        else {
            if (args.length < 2)
                new ChatServer(Integer.parseInt(args[0]), 0, 0);
            else {
                if (args.length < 3)
                    new ChatServer(Integer.parseInt(args[0]), Integer.parseInt(args[1]), 0);
                else
                    new ChatServer(Integer.parseInt(args[0]),
                            Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            }
        }
    }
}