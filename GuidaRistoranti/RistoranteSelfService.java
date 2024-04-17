public class RistoranteSelfService extends Ristorante {
    boolean areaBambini;
    public RistoranteSelfService(String nome, int posti, boolean areaBambini){
        super(nome, posti);
        this.areaBambini = areaBambini;
    }
    public int coperto(){
        return 1 + ((areaBambini) ? 1 : 0) + ((getNumeroPosti() < 30) ? 1 : 0);
    }
}
