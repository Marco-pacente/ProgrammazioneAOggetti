public class NRQuicksort {
    static int partition(int v[], int inizio, int fine) {
        int pivot = v[inizio]; // il pivot è arbitrario, qui scegliamo l'inizio
        do {
            while (inizio < fine && v[fine] > pivot) { // i valori più grandi del pivot già a destra vengono lasciati
                                                       // dove sono
                fine--;
            }
            if (inizio < fine) { // se non è già tutto a posto
                v[inizio] = v[fine];
                inizio++;
                while (inizio < fine && v[inizio] <= pivot) { // stessa cosa di sopra, ciò che è già a posto rimane a
                                                              // posto
                    inizio++;
                }
                // arrivati a questo punto, o si sono già incrociati inizio e fine o si è
                // trovato qualcosa di più grande del pivot
                if (inizio < fine) { // nel secondo caso si scambiano inizio e fine
                    v[fine] = v[inizio];
                    fine--;
                }
            }
        } while (inizio < fine);
        v[inizio] = pivot; // si recupera il valore del pivot
        return inizio; // e si restituisce il mezzo
    }

    static void quicksortNR(int v[]) {
        int inizio, fine, mid;
        Pila p = new Pila();
        Elemento e;
        p.inserisci(0, v.length - 1);//si inserisce tutto l'array nella pila degli elementi non ordinati

        while ((e = p.estrai()) != null) {
            inizio = e.inizio;
            fine = e.fine;
            mid = partition(v, inizio, fine);
            if ((mid - 1 - inizio) < (fine - (mid + 1))) { //se la parte sinistra è più piccola di quella destra viene inserita per prima
                if (mid + 1 < fine) //quindi se c'è più di un elemento a destra viene inserita per prima
                    p.inserisci(mid + 1, fine); 
                if (inizio < mid - 1)//poi idem per la parte a sinistra
                    p.inserisci(inizio, mid - 1);
            } else { //se la parte destra è più grande si inserisce questa
                if (inizio < mid - 1) //stessa cosa di sopra ma con la parte sinistra prima
                    p.inserisci(inizio, mid - 1);
                if (mid + 1 < fine)
                    p.inserisci(mid + 1, fine);
            }
        }
    }
}