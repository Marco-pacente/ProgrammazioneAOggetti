public class App {
    public static void main(String[] args) {
        Vettore v = new Vettore(10, 10);
        v.stampa();
        System.out.println("Somma: " + v.somma(10));
        System.out.println("Media: " + v.media());
        System.out.println("Posizione di 4 nel vettore: " + v.pos(4));
        System.out.println("Max: " + v.max());
        System.out.println("1.0001 alla 1.000.000.000.000: " + v.potenzaCr(1.0001, 30000));
        System.out.println("Posizione di 7 nell'array: " + v.ricercaBR(7));
    }
}