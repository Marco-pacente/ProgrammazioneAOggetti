public class ViteFerro extends Vite {
    public ViteFerro(double diametro, boolean isAcciaio){
        super(diametro);
        this.isAcciaio = isAcciaio;
    }
    boolean isAcciaio;
    double costo(){
        double costo = 0.02*diametro;
        if (isZincata()) {
            costo +=0.2;
        }

        if (isAcciaio) {
            costo+=0.1;
        }
        return costo;
    }

}