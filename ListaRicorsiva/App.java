public class App {
    public static void main(String[] args) {
        Lista list = new Lista(10);
        System.out.println("Lunghezza lista = " + list.lunghezza(list.testa));
        System.out.println(list.toString());
        System.out.println("\"ciao\" è presente nella lista : " + list.ricerca("ciao"));
    }
}
