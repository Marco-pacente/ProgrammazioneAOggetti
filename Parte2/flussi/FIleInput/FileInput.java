import java.io.*;
import java.util.Scanner;
public class FileInput{
    public static void main(String[] args){
        String nome = null;
        try(Scanner tastiera = new Scanner(System.in)){
            System.out.println("Nome da leggere: ");
            nome = tastiera.nextLine();
            tastiera.close();
        }
        int n = 0;
        double s = 0, num;

        try{
                File f = new File(nome);
                Scanner infile = new Scanner(f);
                while (infile.hasNextDouble()) {
                    num = infile.nextDouble();
                    System.out.println(num);
                    s+=num;                    
                }
                
        }catch(FileNotFoundException e){
            System.out.println("file non trovato");
        }
    }
}