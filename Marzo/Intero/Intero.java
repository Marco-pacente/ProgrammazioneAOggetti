public class Intero {
    private int numero;
    public Intero(int n){
        this.numero = n;
    }
    
    public void set(int n){
        this.numero = n;
    }

    public int get(){
        return this.numero;
    }

    public boolean isEven(){
        return((this.numero%2)==0);
    }
    
    public int isSquare(){
        for(int i = 0; i <= this.numero/2; i++){
            if (i*i == this.numero) {
                return i;
            }
        }
        return 0;
    }


    

}