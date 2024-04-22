public abstract class Disco{
    String titolo;
    private int durata;
    public Disco(String titolo, int durata){
        this.titolo = titolo;
        this.durata = durata;
    }
    public void incidi(int minuti){
        durata = minuti;
    }
    public int getDurata(){
        return durata;
    }
    public abstract double costo();
}