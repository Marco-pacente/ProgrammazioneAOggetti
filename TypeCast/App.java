public class App {
    public static void main(String[] args) {
        double d = 2.5;
        System.out.println((int) d); //si stampa la parte intera di d
        //qui c'è un'effettiva "trasformazione" del dato

        Ogg1 ogg = new Ogg1();
        ogg.attr1 = 6;
        ((Ogg2)ogg).attr2 = 3; //qui si specifica al compilatore come leggere l'oggetto, ma non viene trasformato  
    }
}