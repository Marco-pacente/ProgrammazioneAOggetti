import java.io.*;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        String nome = null;
        System.out.println("inserire nome file");
        Scanner tastiera = new Scanner(System.in);
        nome = tastiera.nextLine();
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}