public class Mucca extends AnimaleDaCortile {
    public Mucca(int peso, int eta) {
        super(peso, eta);
    }

    void verso() {
        System.out.println("*verso mucca*");
    }

    void mostra() {
        System.out.println("Mucca:");
        super.mostra();
    }
}