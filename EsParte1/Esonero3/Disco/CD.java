public class CD extends Disco{
    boolean haMusicaItaliana;
    public CD(String titolo, int durata, boolean hmi){
        super(titolo, durata);
        this.haMusicaItaliana = hmi;
    }
    public double costo(){
        return (0.3*getDurata()) + (haMusicaItaliana ? 3 : 0);
    }
}