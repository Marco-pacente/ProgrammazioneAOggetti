public class Gallina extends AnimaleDaCortile{
    public Gallina(int peso, int eta){
        super(peso, eta);
    }
    
    void verso(){
        System.out.println("*verso gallina*");
    }

    void mostra(){
        System.out.println("Gallina:");
        super.mostra();
    }
}