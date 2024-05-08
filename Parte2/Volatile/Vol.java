public class Vol extends Thread{
    private volatile boolean stop = false; 
    //"volatile" specifica al metodo run() di rileggere veramente il valore di stop
    //invece potrebbe solo leggerlo una volta e ricordarlo
    public void run(){
        while(!stop){
            System.out.println("a");
            try{
                sleep(1000);
            }catch(InterruptedException e){}
        }
    }

    public void tellStop(){
        stop = true;
    }
    public static void main(String[] args) {
        Vol v = new Vol();
        v.start();
        try{
            sleep(5000);
        }catch(InterruptedException e){}
        v.tellStop();
    }
}