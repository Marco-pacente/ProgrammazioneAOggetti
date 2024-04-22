public class Vinile extends Disco{
    int nGiri;
    public Vinile(String titolo, int durata, int nGiri){
        super(titolo, durata);
        this.nGiri = nGiri;
    }
    public double costo(){
        return (0.5*getDurata()) + ((nGiri == 33) ? 5 : 0);
    }
}
