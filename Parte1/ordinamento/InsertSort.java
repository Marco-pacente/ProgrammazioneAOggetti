public class InsertSort{
    static void sort(int[] v){
        int minInd;
        for(int i = 0; i < v.length; i++){
            minInd = i;
            for(int j = i; j < v.length; j++){
                if (v[j] < v[minInd]) {
                    minInd = j;
                }
            }
            int temp;
            temp = v[i];
            v[i] = v[minInd];
            v[minInd] = temp;
        }
    }

    
}