public class Elemento{
    String stringa;
    Elemento eNext;
    public Elemento(String s, Elemento next){
        this.stringa = s;
        this.eNext = next;
    }

    public void stampa(){
        System.out.println(stringa);
    }
}