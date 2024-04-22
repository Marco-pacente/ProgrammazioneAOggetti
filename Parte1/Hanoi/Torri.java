import java.time.Instant;

public class Torri{
    private static void hanoi(int N, String S, String I, String D){
        if(N == 1){
            trasferisci(1, S, D);
        }else{
            hanoi(N-1, S, D, I);
            trasferisci(N, S, D);
            hanoi(N-1, I, S, D);
        }
    }
    public static void hanoi (int N){
        hanoi (N, "sorgente", "intermedio", "destinazione");
    }

    private static void trasferisci (int N, String S, String D){
        System.out.println("Sposta il disco "+N + " da "+S+" a "+D);
    }
    public static void main(String[] args){
        long time = Instant.now().getEpochSecond();
        hanoi(Integer.parseInt(args[0]));
        System.out.println(Instant.now().getEpochSecond()-time);
    }
}