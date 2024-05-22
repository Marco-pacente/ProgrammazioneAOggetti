import java.util.Random;

public class Cont {
    public int M;
    public int cont;

    Cont(){
        M = new Random().nextInt(10)+2;
        cont = 0;
    }

    public synchronized void aggiorna(int n){
        if(M%n!=0){
            cont++;
        }
    }
}