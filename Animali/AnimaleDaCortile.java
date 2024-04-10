public abstract class AnimaleDaCortile extends Animale{
    int peso;

    public AnimaleDaCortile(int peso, int eta){
        super(eta);
        this.peso = peso;
    }

    void mostra(){
        System.out.println("Peso: " + peso);
        super.mostra();
    }

    abstract void verso();
}
