import java.util.Random;

public class Lista {
    ElementoC testa;
    public Lista(int n){
        Random r = new Random();
        ElementoC scan = testa;
        String[] nomi = {"marca0", "marca1", "marca2", "marca3", "marca4", "marca5"};
        for(int i = 0; i < n; i++){
            scan = new ElementoC(nomi[r.nextInt(6)], r.nextInt(16, 128));
            scan = scan.next;
        }
    }

    public void stampa(){
        ElementoC scan = testa;
        while (scan != null) {
            System.out.println("si");
            scan.stampa();
            scan = scan.next;
        }
    }

    public void stampaR(){
        stampaR(testa);
    }

    public void stampaR(ElementoC scan){
        if (scan == null) {
            return;
        }else{
            scan.stampa();
            stampaR(scan.next);
        }
    }
    

    public int conta(String m, int c){
        ElementoC scan = testa;
        int cont = 0;
        while (scan != null) {
            if (scan.capacita == c && scan.marca.equals(m)) {
                cont++;                
            }
        }
        return cont;
    }

    public int contaR(String m, int c){
        return contaR(testa, m, c);
    }

    private int contaR(ElementoC scan, String m, int c){
        if (scan == null) {
            return 0;            
        }else{
            return ((scan.capacita == c && scan.marca.equals(m)) ? 1 : 0) + contaR(scan.next, m, c);
        }
    }
}