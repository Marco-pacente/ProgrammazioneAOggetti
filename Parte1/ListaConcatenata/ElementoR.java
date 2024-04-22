public class ElementoR{
    String stringa;
    Elemento eNext;
    public ElementoR(String s, Elemento next){
        this.stringa = s;
        this.eNext = next;
    }

    public void stampa(){
        System.out.println(stringa);
    }
}