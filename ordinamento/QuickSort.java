public class QuickSort {
    public static int partition(int v[], int inizio, int fine){
        int pivot = v[inizio];
        do{
            while (inizio < fine && v[fine] >= pivot) {
                fine--;
            }
            if (inizio < fine) {
                v[inizio] = v[fine];
                inizio++;
                while (inizio < fine && v[inizio] <= pivot) {
                    inizio++;
                }
                if (inizio < fine) {
                    v[fine] = v[inizio];
                    fine--;
                }
            }
        }while(inizio < fine);
        v[inizio] = pivot;
        return inizio;  
    }
}