import java.util.Random;

public class Negozio {
    Vite[] v;
    public Negozio(int m, int n){
        v = new Vite[m+n];
        Random r = new Random();
        for(int i = 0; i < m; i++){
            v[i] = new ViteLegno(r.nextInt(30)/10, r.nextBoolean());
            if (r.nextBoolean()) {
                v[i].zincatura();                
            }
        }
        for(int i = m; i < m+n; i++){
            v[i] = new ViteFerro(r.nextInt(30)/10, r.nextBoolean());
            if (r.nextBoolean()) {
                v[i].zincatura();                
            }
        }
    }

    public double minCostoD(double d){
        double min = Double.MAX_VALUE;
        for(int i = 0; i < v.length; i++){
            if (v[i].diametro == d && v[i].costo() < min) {
                min = v[i].costo();
            }
        }
        return min;
    }
}