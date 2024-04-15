public class Professionista extends Tennista {
    int punteggio;

    public Professionista(String nome, int anniIscrizione, int punteggio){
        super(nome, anniIscrizione);
        this.punteggio = punteggio;
    }

    public int costoIscrizione(){
        return 500 + (punteggio<2000 ? 0 : 100);
    }

    void stampa(){
        super.stampa();
        System.out.println("Punteggio: " + punteggio);
    }
}