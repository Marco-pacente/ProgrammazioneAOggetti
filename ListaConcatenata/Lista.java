import java.util.Random;

public class Lista {
    Elemento testa = null;
    public Lista(int n){
        Random r = new Random();
        testa = null;
        for(int i = 0; i < n; i++){
            String a = "";
            int ripetizioni = r.nextInt(1, 10);
            for (int j = 0; j < ripetizioni; j++) {
                a += "ciao";
            }
            testa = new Elemento(a, testa);
        }
    }

    public void stampa(){
        Elemento scan = testa;
        while (scan != null) {
            scan.stampa();
            scan = scan.eNext;
        }
    }
}