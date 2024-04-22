public class QuickSort {
    static int partition(int v[], int inizio, int fine){
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
    private static void quickSort(int[] v, int inizio, int fine){
        if (inizio < fine) {
            int mid = partition(v, inizio, fine);
            quickSort(v, inizio, mid-1);
            quickSort(v, mid+1, fine);            
        }
    }

    public static void sort(int[] v){
        quickSort(v, 0, v.length-1);
    }
}