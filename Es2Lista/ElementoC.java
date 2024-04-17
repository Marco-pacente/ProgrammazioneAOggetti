public class ElementoC{
    String marca;
    int capacita;
    ElementoC next;
    public ElementoC(String marca, int capacita){
        this.marca = marca;
        this.capacita = capacita;
    }
    void stampa(){
        System.out.println("Marca: " + marca);
        System.out.println("Capacità: " + capacita);
    }
}