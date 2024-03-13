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

    public int sommaLunghezze(int n){
        int somma = 0;
        int lunghezza;
        for (Elemento scan = testa; scan != null; scan = scan.eNext) {
            lunghezza = scan.stringa.length();
            if(lunghezza>n){
                somma += lunghezza;
            }
        }
        return somma;
    }

    public double mediaLunghezze(){
        double somma = 0;
        int cont = 0;
        int lunghezza;
        for (Elemento scan = testa; scan != null; scan = scan.eNext) {
            lunghezza = scan.stringa.length(); 
            if (lunghezza%2 == 0) {
                somma += lunghezza;
                cont++;
            }
        }
        double media = 0;
        if (cont!=0) {
            media = somma/cont;
        }
        return media;
    }

    public boolean verifica(String s){
        for(Elemento scan = testa; scan!=null; scan = scan.eNext){
            if (scan.stringa.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public int contaLunghezzeUguali(String s){
        int cont = 0;
        int lunghezza = s.length();
        for(Elemento scan = testa; scan != null; scan = scan.eNext){
            if (scan.stringa.length()==lunghezza) {
                cont++;
            }
        }
        return cont;
    }

    public int maxLunghezze(){
        int max = 0;
        int lunghezza;
        for(Elemento scan = testa; scan != null; scan = scan.eNext){
            lunghezza = scan.stringa.length();
            if (lunghezza > max) {
                max = lunghezza;
            }
        }
        return max;
    }
    

    public int maxLunghezzeN(int n){
        int max = 0;
        int lunghezza;
        for(Elemento scan = testa; scan != null; scan = scan.eNext){
            lunghezza = scan.stringa.length();
            if (lunghezza > max && lunghezza < n) {
                max = lunghezza;
            }
        }
        return max;
    }
}