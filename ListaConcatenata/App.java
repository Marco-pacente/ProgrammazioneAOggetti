public class App{
    public static void main(String[] args){
        Lista list = new Lista(70);
        list.stampa();
        System.out.println("Somma lunghezze maggiori di 10: " + list.sommaLunghezze(10));
        System.out.println("Media lunghezze pari: " + list.mediaLunghezze());
        System.out.println("Verifica Hello: " + list.verifica("Hello"));
        System.out.println("Massimo lunghezze stringhe: " + list.maxLunghezze());
        System.out.println("Massimo lunghezze stringhe minore di n: " + list.maxLunghezzeN(5));
    }
}