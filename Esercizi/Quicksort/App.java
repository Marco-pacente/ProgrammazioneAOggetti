import java.util.Random;
public class App{
    public static void main(String[] args) {
        int[] v = new int[10    ];
        Random r = new Random();
        for(int i = 0; i < v.length; i++){
            v[i] = r.nextInt(100);
        }
        for (int i : v) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        NRQuicksort.quicksortNR(v);
        for (int i : v) {
            System.out.print(i + "\t");
        }
    }
}