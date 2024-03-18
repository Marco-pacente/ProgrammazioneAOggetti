import pack1.*;
public class Main {
    public static void main(String[] args) {
        Oggetto a = new Oggetto(6);
        System.out.println("a: " + a.getA());
        a.setA(a.getA()+2);
        System.out.println("a: " + a.getA());
    }
}