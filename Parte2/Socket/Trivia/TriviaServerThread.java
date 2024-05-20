import java.io.*;
import java.net.*;
import java.util.random.*;
public class TriviaServerThread extends Thread {
    private String[] questions;
    private String[] answers;
    private Socket clientSocket = null;
    int num = 0;
    final int WAITFORCLIENT = 0;
    final int WAITFORANSWER = 1;
    final int WAITFORCONFIRM = 2;
    int state = WAITFORCLIENT;
    public TriviaServerThread(Socket incoming, String[] questions, String[] answers) {
        this.clientSocket = incoming;
        this.questions = questions;
        this.answers = answers;
    }

    public void run() {
        try {
            DataInputStream is = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
            DataOutputStream os = new DataOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));
            String inLine, outLine;
            outLine = processInput(null);
            os.writeUTF(outLine);
            os.flush();
            if (outLine.equals("Bye")) {
                break;
            }
            os.close();
            is.close();
            clientSocket.close();
        } catch (Exception e) {
            
        }
    }
}