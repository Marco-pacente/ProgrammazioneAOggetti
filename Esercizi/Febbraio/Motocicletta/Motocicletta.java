class Motocicletta {
    String marca;
    String colore;
    boolean accesa = false;

    public Motocicletta(String marca, String colore) {
        this.marca = marca;
        this.colore = colore;
    }

    void accendi(){
        if (accesa == true) {
            System.out.println("E' già accesa");
        }else{
            accesa = true;
            System.out.println("Ora la moto è accesa");
             
        }
    }

    void mostra(){
        System.out.println("Questa moto è una " + marca + " " + colore);

        if (accesa) {
            System.out.println("E' accesa");
        }else{
            System.out.println("E' spenta");
        }
    }



    public static void main(String[] args) {
        Motocicletta moto = new Motocicletta("uyf", "bianca"); //moto occupa sempre 4 byte
                                                                            //perchè è un riferimento
        System.out.println("Descrizione");
        moto.mostra();

        System.out.println("Accensione:");
        moto.accendi();

        System.out.println("Descrizione");
        moto.mostra();
    }
}