public class App {
    public static void main(String[] args) {
        Lavoratore l1 = new Operaio();
        //l1.specializzazione = "Amblangatore"; //questo dà errore
        ((Operaio)l1).specializzazione = "brugolatore"; //questo no
        Lavoratore l2 = new Impiegato();
        ((Impiegato)l2).anzianita = 23;
        System.out.println("Operaio stipendio: " + l1.stipendio());
        System.out.println("Impiegato stipendio: " + l2.stipendio());
    }
}