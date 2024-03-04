import java.util.Random;

public class Vettore {
    int[] v;

    public Vettore(int n) {
        v = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            v[i] = (r.nextInt() % 100);
        }
    }

    public void stampa() {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public int somma(int n) {
        int somma = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > n) {
                somma = somma + v[i];
            }
        }
        return somma;
    }

}