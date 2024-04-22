import java.util.Random;

public class Circolo {
    Tennista V[];
    public Circolo(int n, int m){
        V = new Tennista[n+m];
        Random rand = new Random();
        for(int i = 0; i < n; i++){
            V[i] = new Professionista("Prof", rand.nextInt(15)+1, rand.nextInt(10000)+1);
        }
        for(int i = n; i < n+m; i++){
            V[i] = new Dilettante("Dil", rand.nextInt(10)+1, rand.nextInt(50)+1);
        }
    }

    public void stampa(){
        for(int i = 0; i < V.length; i++){
            V[i].stampa();
        }
    }

    public double mediaCostiIscrizioneMaggioriN(int n){
        double media = 0;
        int cont = 0;

        for(int i = 0; i < V.length; i++){
            if (V[i].getAnniIscrizione()>n) {
                media += V[i].costoIscrizione();
                cont++;
            }
        }

        if (cont==0) {
            return 0;
        }else{
            return media/=cont;
        }
    }


}