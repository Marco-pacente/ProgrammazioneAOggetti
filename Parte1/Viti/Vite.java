public abstract class Vite{
    public Vite(double diametro){
        this.diametro = diametro;
    }

    double diametro;
    private boolean zincata = false;

    void zincatura(){
        zincata = true;
    }

    boolean isZincata(){
        return zincata;
    }

    abstract double costo();    
}