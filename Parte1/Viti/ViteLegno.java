public class ViteLegno extends Vite {
    public ViteLegno(double diametro, boolean cacciaviteAStella){
        super(diametro);
        this.cacciaviteAStella = cacciaviteAStella;
    }
    boolean cacciaviteAStella;
    double costo(){
        double costo = 0.01*diametro;
        if (isZincata()) {
            costo +=0.1;
        }

        if (cacciaviteAStella) {
            costo+=0.1;
        }
        return costo;
    }
}