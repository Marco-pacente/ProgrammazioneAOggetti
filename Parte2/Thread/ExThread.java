public class ExThread extends Thread{
    String s;
    public ExThread(String s){
        super();
        this.s = s;
    }
    public void run(){
        for(int i = 0; i < 100; i++) {
            System.out.println(s);
            try{
                sleep(100);
            }catch(Exception e){
                break;
            }
        }
    }
    public static void main(String[] args) {
        ExThread t1 = new ExThread("ping");
        ExThread t2 = new ExThread("pong");
        t1.start();
        t2.start();
    }
}