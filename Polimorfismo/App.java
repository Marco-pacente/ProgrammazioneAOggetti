public class App {
    public static void main(String[] args) {
        Lavoratore l1 = new Operaio();
        //l1.specializzazione = "Amblangatore"; //questo dà errore
        ((Operaio)l1).specializzazione = "brugolatore"; //questo no
    }
}