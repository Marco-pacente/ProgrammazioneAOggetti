class Elemento{
    int n;
    Elemento next;
    public Elemento(int n){
        this.n = n;
    }
}

class Pila{
    Elemento testa;
    private int numeroElementi = 0;
    public Pila(int n){
        testa = new Elemento(n);
        numeroElementi++;
    }
    public Elemento estrai(){
        if (testa == null) {
            return null;
        }else{
            Elemento e = testa;
            testa = testa.next;
            numeroElementi--;
            return e;
        }
    }
    public int getNumeroElementi(){
        return numeroElementi;
    }
}