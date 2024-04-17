public abstract class Ristorante{
    String nome;
    private int numeroPosti;
    public Ristorante(String nome, int numeroPosti){
        this.nome = nome;
        this.numeroPosti = numeroPosti;
    }
    void ristruttura(int n){
        numeroPosti += n;
    }
    int getNumeroPosti(){
        return numeroPosti;
    }

    public abstract int coperto();
}