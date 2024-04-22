public class BubbleSort {
    static void sort(int[] v){
        int temp;
        for (int i = 0; i < v.length; i++) {
            for(int j = 0; j < v.length-1-i; j++){
                if(v[j] > v[j+1]){
                    temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
        //complessità spaziale costante
        //perchè v è un riferimento
    }
}