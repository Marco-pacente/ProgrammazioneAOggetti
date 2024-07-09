public class Quicksort{
    public static void sort(int[] v){
        quicksort(v, 0, v.length-1);;
    }
    static void quicksort(int[] v, int inizio, int fine){
        if (inizio < fine) {
            int mid = part(v, inizio, fine); //si fa partire l'algoritmo di partizione, che divide l'array in due parti, con la parte sinistra
            quicksort(v, inizio, mid-1);//si riapplica l'algoritmo alle due parti
            quicksort(v, mid+1, fine);
        }
    }
    static int part(int v[], int inizio, int fine){
        int pivot = v[inizio]; //il pivot è arbitrario, qui scegliamo l'inizio
        do{
            while (inizio < fine && v[fine] > pivot) { //i valori più grandi del pivot già a destra vengono lasciati dove sono
                fine--;
            }
            if (inizio < fine) { //se non è già tutto a posto
                v[inizio] = v[fine];
                inizio++;
                while (inizio < fine && v[inizio] <= pivot) { //stessa cosa di sopra, ciò che è già a posto rimane a posto
                    inizio++;
                }
                //arrivati a questo punto, o si sono già incrociati inizio e fine o si è trovato qualcosa di più grande del pivot
                if (inizio < fine) { //nel secondo caso si scambiano inizio e fine
                    v[fine] = v[inizio];
                    fine--;
                }
            }
        }while(inizio < fine);
        v[inizio] = pivot; //si recupera il valore del pivot
        return inizio; // e si restituisce il mezzo
    }
}