public class Motocicletta{
    String marca;
    String colore;
    boolean accesa;

    void mostra(){
        System.out.println("Questa moto è una " + marca + " " + colore);

        if (accesa) {
            System.out.println("E' accesa");
        }else{
            System.out.println("E' spenta");
        }
    }
    
    public Motocicletta(String marca, String colore, boolean accesa){
        this.marca = marca;
        this.colore = colore;
        this.accesa = accesa;
    }

    public void accendi(){
        if (this.accesa == true) {
            System.out.println("E' già accesa");
        }else{
            this.accesa = true;
            System.out.println("Ora è accesa");
        }
    }
}