import java.io.*;
public class App{
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        try{
            in = new BufferedReader(new FileReader("in.txt"));
            out = new BufferedWriter(new FileWriter("out.txt"));
            String s = null;
            while ((s = in.readLine())!=null) {
                out.append(s+"\n");
                out.flush();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}