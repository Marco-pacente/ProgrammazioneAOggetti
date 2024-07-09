import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random r = new Random();
        int v[] = new int[100];
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(100);
        }        for (int i : v) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        System.out.println("ordinamento");
        QuickSort.sort(v);
        System.out.println("ordinato");
        
        for (int i : v) {
            System.out.println(i);
        }
    }
}
