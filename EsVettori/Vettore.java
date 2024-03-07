import java.util.Random;

public class Vettore {
    int[] v;

    public Vettore(int n, int m) {
        v = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            v[i] = (r.nextInt() % m);
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

    public double media() {
        double media = 0;
        int n_pari = 0;

        for (int e : v) {
            if ((e % 2) == 0) {
                n_pari++;
                media += e;
            }
        }
        if (n_pari == 0) {
            return 0;
        }
        media /= n_pari;
        return media;
    }

    public int pos(int n){
        for(int i = 0; i < v.length; i++){
            if(v[i] == n){
                return i;
            }
        }
        return -1;
    }

    public int nElementiUguali(int n){
        int cont = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i] == n){
                cont++;
            }
        }
        return cont;
    }

    public int max(){
        int max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }

    public int maxMin(int n){
        int max = Integer.MIN_VALUE;
        for(int e: v){
            if(e<n && e>max){
                max = e;
            }
        }

        return max == Integer.MIN_VALUE ? 0 : max;
    }

    public double potenza(double base, long esponente){
        double p = 1;

        for (int i = 0; i <= esponente; i++) {
            p *= base;
        }
        return p;
    }

    public double potenzaCr(double base, long esponente){
        double p = 1;

        while (esponente > 0) {
            if (esponente %2 != 0) {
                p = p * base;
                esponente--;
            }
            base = base*base;
            esponente /= 2;
        }
        return p;

    }
}