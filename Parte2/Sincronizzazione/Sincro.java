public class Sincro{
    public static void main(String[] args) {
        Conto conto = new Conto(0);
        Inc i = new Inc(conto);
        Dec d = new Dec(conto);
        i.start();
        d.start();
        try{Thread.sleep(10);}catch(InterruptedException e){}
        System.out.println(conto.getConto());
        try{
            i.join();
            d.join();
        }catch(InterruptedException e){}
        System.out.println(conto.getConto());
    }
}
class Conto{
    private int conto = 0;
    public Conto(int in){
        conto = in;
    }
    public void inc(){ //vanno bene entrambi i metodi
        synchronized(this){ //in questo modo il metodo può essere eseguito da un solo thread alla volta
            conto++;
        }
    }
    public synchronized void dec(){ //almeno penso
        conto--;
    }

    public int getConto(){
        return conto;
    } 
}
class Inc extends Thread{
    Conto c;
    public Inc(Conto c){
        this.c = c;
    }
    public void run(){
        for(int i = 0; i < 20000; i++){
            c.inc();
        }
    }
}
class Dec extends Thread{
    Conto c;
    public Dec(Conto c){
        this.c = c;
    }
    public void run(){
        for(int i = 0; i < 20000; i++){
            c.dec();
        }
    }
}