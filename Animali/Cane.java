public class Cane extends AnimaleDomestico {
    public Cane(String nome, int eta) {
        super(nome, eta);
    }

    void verso() {
        System.out.println("*verso cane");
    }

    void mostra() {
        System.out.println("Cane:");
        super.mostra();
    }
}
