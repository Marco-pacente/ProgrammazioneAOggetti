import java.util.Random;
public class Negozio {
    Disco[] V;
    public Negozio(int n, int m){
        Random rand = new Random();
        V = new Disco[n+m];
        String[] nomi = {"nome1", "nome2", "nome3"};
        for (int i = 0; i < n; i++) {
            V[i] = new Vinile(nomi[rand.nextInt(3)], rand.nextInt(60), rand.nextInt(66));
        }
        for(int i = n; i < n+m; i++){
            V[i] = new CD(nomi[rand.nextInt(3)], rand.nextInt(120), rand.nextBoolean());
        }
    }
    public boolean magNminN(int n){
        int magN = 0, minN = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i].costo() > n) {
                magN++;
            }
            if (V[i].costo() < n) {
                minN++;
            }
        }
        return magN > minN;
    }
}