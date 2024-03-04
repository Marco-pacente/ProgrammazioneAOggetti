public class App {
    public static void main(String[] args) {
        Intero n = new Intero(4);
        System.out.print("Il numero " + n.get() + " è ");
        if (n.isEven()) {
            System.err.println("pari");
        }else{
            System.out.println("dispari");
        }
        if(n.isSquare()==0){
            System.out.println("Non è un quadrato");
        }else{
            System.out.println("E' il quadrato di " + n.isSquare());
        }
    }
}