public class MaxLung {
    public static int max = 0;
    public static synchronized void aggiorna(int n){
        if (n > max) {
            max = n;
        }
    }
}