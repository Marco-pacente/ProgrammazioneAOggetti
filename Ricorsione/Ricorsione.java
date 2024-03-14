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

    public static double fibonacciC(int n){
        double fn = 1;
        double fnm1 = 1;
        double tmp;
        for(int i = 3; i < n; i++){
            tmp = fn;
            fn = fn+fnm1;
            fnm1 = tmp;
        }
        return fn;
    }

    public static double fibonacciCR(long fn, long fnm1){
        
        return fn;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci dei primi 50 numeri: " + fibonacciC(50));
    }
}