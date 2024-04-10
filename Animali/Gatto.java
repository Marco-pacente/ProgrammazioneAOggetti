public class Gatto extends AnimaleDomestico {
    public Gatto(String nome, int eta) {
        super(nome, eta);
    }

    void verso() {
        System.out.println("*verso gatto*");
    }

    void mostra() {
        System.out.println("Gatto: ");
        super.mostra();
    }
}