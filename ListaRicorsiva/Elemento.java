public class Elemento{
    String s;
    Elemento eNext;
    public Elemento(String s, Elemento next){
        this.s = s;
        this.eNext = next;
    }

    public void stampa(){
        System.out.println(s);
    }
}