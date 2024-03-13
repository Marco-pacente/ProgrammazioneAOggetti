public class Ricorsione {
    public static double fattoriale(int n) {
        if (n == 0 || n == -1) {
            return 1;
        } else {
            return n * fattoriale(n-1);
        }
    }

    public static long fibonacci(int n){
        if(n<=2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci dei primi 50 numeri: " + fibonacci(50));
    }
}