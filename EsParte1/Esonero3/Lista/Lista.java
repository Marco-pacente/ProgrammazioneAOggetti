public class Lista {
    Elemento testa;
    public Lista(int n){
        for(int i = n; i > 0; i--){
            testa = new Elemento(("Elemento" + i), testa);
        }
    }
    public String toString(){
        String s = "";
        Elemento scan = testa;
        while (scan != null) {
            s += (scan.s + "\n");
            scan = scan.next;
        }
        return s;
    }
    public boolean verifica(int n, String s){
        Elemento scan = testa;
        int nUguali = 0;
        while (scan != null) {
            nUguali += (scan.s.equals(s)) ? 1 : 0;
            scan = scan.next;
        }
        System.out.println(nUguali);
        return (nUguali==n);
    }
    public boolean verificaR(int n, String s){
        return (verificaR(testa, s) == n);
    }
    private int verificaR(Elemento scan, String s){
        if (scan == null) {
            return 0;
        }
        return ((scan.s.equals(s)) ? 1 : 0) + verificaR(scan.next, s);
    }
}