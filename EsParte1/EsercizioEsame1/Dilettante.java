public class Dilettante extends Tennista{
    
    int torneiPartecipati;
    
    public Dilettante(String nome, int anniIscrizione, int torneiPartecipati){
        super(nome, anniIscrizione);
        this.torneiPartecipati = torneiPartecipati;
    }
    

    int costoIscrizione(){
        return 300 + (torneiPartecipati<20? 150 : 0);
    }

    void stampa() {
        super.stampa();
        System.out.println("Numero tornei partecipati: " + torneiPartecipati);

    }
}