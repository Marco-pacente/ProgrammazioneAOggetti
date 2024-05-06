import java.util.Scanner;
public class Eccezione{
    public static void main(String[] args){
        int[] v = {5, 7, 8, 2, 12, 53, 12};
        Scanner in = new Scanner(System.in);
        int inp;
        do{
            System.out.println("Inserire un indice");
            inp = in.nextInt();
            try{
                System.out.println(v[inp]);
            }catch(IndexOutOfBoundsException e){
                System.out.println("Errore: " + e.getMessage());
                continue;
            }
        }while(true);
    }
}