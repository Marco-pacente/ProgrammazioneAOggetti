public class App {
    public static void main(String[] args) {
        Lista list = new Lista(10);
        System.out.println("Lunghezza lista = " + list.lunghezza(list.testa));
        System.out.println(list.toString());

        System.out.println("Somma lunghezze maggiori di 9: " + list.sommaLunghezze(9));
        System.out.println("La lista contiene la stringa \"ciao\": " + list.contiene("ciao"));
        System.out.println("Numero stringhe lunghezza uguale a casa: " + list.numeroStringheUguali("casa"));
        System.out.println("Lunghezza massima: " + list.maxLunghezze());
        System.out.println("Lunghezza massima minore di 12: " + list.maxLunghezzeMinN(12));
    }
}
