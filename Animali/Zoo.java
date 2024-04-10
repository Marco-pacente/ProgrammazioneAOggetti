import java.util.Random;

public class Zoo {
    Animale V[];
    public Zoo(int n){
        V = new Animale[n];
        Random rand = new Random();
        
        for (int i = 0; i < n; i++) {
            int r = rand.nextInt(4);
            switch (r) {
                case 0:
                    V[i] = new Cane("cane", rand.nextInt(15));
                    break;
                case 1:
                    V[i] = new Gatto("gato", rand.nextInt(15));
                    break;
                case 2:
                    V[i] = new Gallina(rand.nextInt(5), rand.nextInt(10));
                    break;
                case 3:
                    V[i] = new Mucca(rand.nextInt(100), rand.nextInt(30));
                    break;
                default:
                    V[i] = new Gatto("no", 0);
            }
        }
    }


    void mostra(){
        for(int i = 0; i < V.length; i++){
            V[i].mostra();
            if (V[i] instanceof Cane) {
                ((Cane)V[i]).verso();//metodo alternativo fantastico metti che decidi che definisci tutto come Object
            }
        }
    }
}