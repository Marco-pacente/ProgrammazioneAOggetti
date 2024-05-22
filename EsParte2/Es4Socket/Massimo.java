public class Massimo {
    private int max;
    public Massimo(){
        max = 0;
    }
    public synchronized void aggiorna(int n){
        if(n> max){
            max = n;
        }
    }
    public int getMax() {
        return max;
    }
}
