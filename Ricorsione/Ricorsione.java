public class Ricorsione {
    public static double fattoriale(int n) {
        if (n == 0 || n == -1) {
            return 1;
        } else {
            return n * fattoriale(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Fattoriale 10: " + fattoriale(500000));
    }
}