public abstract class Animale{
   int eta;

   public Animale(int e){
          eta = e;
   }
   
   void mostra(){
        System.out.println("Eta': " + eta);
   }

   abstract void verso();
}