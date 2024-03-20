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

    public int lunghezza(){
        return lunghezza(testa);
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

    public int sommaLunghezze(int n){
        return sommaLunghezze(testa, n);
    }

    private static int sommaLunghezze(Elemento scan, int n){
        if(scan == null){
            return 0;
        }else{
            int l = scan.s.length();
            if (l>n) {
                return l + sommaLunghezze(scan.eNext, n);
            }else{
                return sommaLunghezze(scan.eNext, n);
            }
        }
    }

    public boolean contiene(String x){
        return contiene(testa, x);
    }

    private static boolean contiene(Elemento scan, String s){
        if (scan == null) {
            return false;
        }else{
            return (scan.s.equals(s) || contiene(scan.eNext, s));
        }
    }

    public int numeroStringheUguali(String x){
        return numeroStringheUguali(testa, x.length());
    }

    private static int numeroStringheUguali(Elemento scan, int l){
        if (scan == null) {
            return 0;
        }else{
            int r1 = numeroStringheUguali(scan.eNext, l);
            if (scan.s.length() == l) {
                return 1 + r1;                
            }else{
                return r1;
            }
        }
    }

    public int maxLunghezze(){
        return maxLunghezze(testa);
    }

    private static int maxLunghezze(Elemento scan){
        if (scan == null) {
            return 0;
        }
        int max = maxLunghezze(scan.eNext); 
        int e = scan.s.length();
        if (e>max) {
            return e;
        }else{
            return max;
        }
    }

    public int maxLunghezzeMinN(int n){
        return maxLunghezzeMinN(testa, n);
    }

    private static int maxLunghezzeMinN(Elemento scan, int n){
        if (scan == null) {
            return 0;
        }
        int max = maxLunghezzeMinN(scan.eNext, n); 
        int e = scan.s.length();
        if (e>max && e<n) {
            return e;
        }
        return max;
    }


}