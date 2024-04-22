public class RistoranteTradizionale extends Ristorante {
    boolean sommelierPresente;
    public RistoranteTradizionale(String nome, int numeroPosti, boolean sommelierPresente){
        super(nome, numeroPosti);
        this.sommelierPresente = sommelierPresente;
    }
    public int coperto(){
        return 2 + ((sommelierPresente) ? 1 : 0) + ((getNumeroPosti() < 50) ? 2 : 0);
    }
     
}