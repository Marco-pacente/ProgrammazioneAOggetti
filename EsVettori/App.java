public class App {
    public static void main(String[] args) {
        Vettore v = new Vettore(10, 10);
        v.stampa();
        System.out.println("Somma: " + v.somma(10));
        System.out.println("Media: " + v.media());
        System.out.println("Posizione di 4 nel vettore: " + v.pos(4));
        System.out.println("Max: " + v.max());
    }
}