public abstract class Tennista{
    
    String nome;
    private int anniIscrizione;

    public Tennista(String nome, int anniIscrizione){
        this.nome = nome;
        this.anniIscrizione = anniIscrizione;
    }


    public void rinnovo(){
        anniIscrizione++;
    }

    public int getAnniIscrizione(){
        return anniIscrizione;
    }

    abstract int costoIscrizione();

    void stampa(){
        System.out.println("Nome: " + nome + "\nAnni iscrizione: " + anniIscrizione + "\nCosto iscrizione: " + costoIscrizione());
    }
    
}