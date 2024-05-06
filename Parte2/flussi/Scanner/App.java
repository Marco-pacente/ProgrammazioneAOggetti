import java.io.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        try{
            File f = new File("file.txt");
            Scanner in = new Scanner(f);
            while (in.hasNextInt()) {
                System.out.println(in.nextInt());
            }
        }catch(FileNotFoundException e){
            System.out.println("file non trovato");
        }
        
    }
}