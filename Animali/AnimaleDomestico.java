public class AnimaleDomestico extends Animale {
    String nome;
    
    public AnimaleDomestico(String nome, int eta){
        super(eta);
        this.nome = nome;
    }
    
    void mostra(){
        System.out.println("Nome: " + nome);
        super.mostra();
    }


}