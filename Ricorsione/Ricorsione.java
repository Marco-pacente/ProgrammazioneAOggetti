public class Ricorsione {
    public static double fattoriale(int n) {
        if (n == 0 || n == -1) {
            return 1;
        } else {
            double f = fattoriale(n-1);
            //System.out.println(f);
            return n * f;
        }
    }
    public static void main(String[] args) {
        System.out.println("Fattoriale 500: " + fattoriale(500));
    }
}