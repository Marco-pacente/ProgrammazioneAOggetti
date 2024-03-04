public class app {
    public static void main(String[] args) {
        Motocicletta m1; //m1 è solo un puntatore
        m1 = new Motocicletta("Breda", "rossa", false); //qui viene effettivamente creata
        //e le vengono inizializzate le variabili marca colore e accesa
        m1.mostra();

        Motocicletta m2 = new Motocicletta("Breda", "rossa", false);

        System.out.println("Le due moto sono uguali: " + (m1==m2)); //i due oggetti hanno gli stessi valori
        //eppure risulta falso
        //questo perchè sono due oggetti diversi e il semplice "==" confronta i puntatori m1 e m2 che sono diversi

        Motocicletta m3; 
        Motocicletta m4 = null; 

        //m3.mostra(); //questo dà errore in compilazione
        //m4.mostra(); //questo fa partire un'eccezione in esecuzione

    }
}