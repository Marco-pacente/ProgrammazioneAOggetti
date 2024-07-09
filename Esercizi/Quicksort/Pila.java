public class Pila {
    private Elemento testa = null;
    private int lunghezza = 0;
    private int lunghezzamassima = 0;

    public void inserisci(int inizio, int fine) {
        testa = new Elemento(inizio, fine, testa);
        lunghezza++;
        if (lunghezzamassima < lunghezza)
            lunghezzamassima = lunghezza;
    }

    public Elemento estrai() {
        if (testa == null)
            return null;
        else {
            Elemento e = testa;
            testa = testa.next;
            lunghezza--;
            return e;
        }
    }

    public int getLunghezzaMassima() {
        return lunghezzamassima;
    }

    public int getLunghezza() {
        return lunghezza;
    }
}