import java.io.*;
import java.net.*;

public class TriviaClient {
    public static void main(String[] args) {
        final int PORTNUM = 1234;
        Socket socket = null;
        DataOutputStream out = null;
        DataInputStream in = null;
        String address;
        if (args.length != 1) {
            System.out.println("Usage: java TriviaClient <address>");
            return;
        }else{
            address = args[0];
        }
        try{
            socket = new Socket(address, PORTNUM);
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        }catch(IOException e){
            System.out.println("Error: couldn't create socket");
            return;
        }

        try {
            StringBuffer str = new StringBuffer(128);
            String inStr;
            int c;

            while ((inStr = in.readUTF())!=null) {
                System.out.println("Server: " + inStr);
                if (inStr.equals("Bye.")) break;
                while ((c = System.in.read()) != '\n') str.append((char)c);
                System.out.println("Client: " + str);
                out.writeUTF(str.toString());
                out.flush();
                str.setLength(0);
            }
            out.close();
            in.close();
            socket.close();

        } catch (Exception e) {
            System.out.println("Exception: I/O Error trying to talk to server");
        }



    }
}