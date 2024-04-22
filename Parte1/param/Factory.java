public class Factory {
    public static void main(String[] args) {
        int[] v = istanzia(15);
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }
    
    public static int[] istanzia(int n){
        int v[] = new int[n];
        for(int i = 0; i < n; i++){
            v[i] = i;
        }
        return v;
    }    
}