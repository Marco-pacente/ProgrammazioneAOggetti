import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random r = new Random();
        int v[] = new int[1000];
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(10000);
        }
        for (int i : v) {
            System.out.println(i);
        }
        System.out.println("ordinamento");
        BubbleSort.bubbleSort(v);
        for (int i : v) {
            System.out.println(i);
        }
    }
}
