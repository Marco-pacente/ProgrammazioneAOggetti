public class Operaio extends Lavoratore {
    String specializzazione;
    double stipendio(){
        return 10 + specializzazione.length();
    }
}