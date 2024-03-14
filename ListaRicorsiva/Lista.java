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

    public int lunghezza(Elemento scan){
        if (scan == null) {
            return 0;
        }else{
            return 1 + lunghezza(scan.eNext);
        }
    }

    public String toString(){
        return "Lista:\n" + toString(testa);
    }

    public String toString(Elemento testa){
        if(testa == null){
            return "";
        }else{
            return testa.s + "\n" + toString(testa.eNext);
        }
    }

    public boolean ricerca(String cerca){
        return ricerca(testa, cerca);
    }


    private boolean ricerca(Elemento t, String cerca){
        if (t == null) {
            return false;
        }

        if (t.s.equals(cerca)) {
            return true;
        }else{
            return ricerca(t.eNext, cerca);
        }
    }
}