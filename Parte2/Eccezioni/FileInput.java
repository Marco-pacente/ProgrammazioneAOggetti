import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        FileInputStream s = null;
        try{
            s = new FileInputStream("file.txt");
            while (s){
                System.out.println(s.read());
            }
        }catch(IOException e){
            System.out.println("errore nella lettura del file");
            s = null;
        }
        finally{
            try{s.close();}catch(Exception e){}
        }
    }
}