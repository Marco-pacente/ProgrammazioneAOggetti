public class ExRunnable implements Runnable{ //utile se si estende già un'altra classe
    public void run(){                       //esempio JFrame
        while (true){
            System.out.println("Parla il thread " + Thread.currentThread().getName());
            //try{Thread.sleep(10);}catch(InterruptedException e){};
            Thread.currentThread().yield();
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println("Nuovo thread creato");
            Thread t = new Thread(new ExRunnable(), (""+i));
            t.start();
            //try{t.join();}catch(InterruptedException stop){} //.join() aspetta che il thread abbia finito
        }
        while (true) {
            System.out.println("parla il main ");
            //try{Thread.sleep(10);}catch(InterruptedException e){};
            Thread.currentThread().yield(); //da la precedenza
        }
    }
}