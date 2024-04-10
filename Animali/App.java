public class App {
    public static void main(String[] args) {
        Zoo z = new Zoo(10);
        System.gc();//svuota la memoria
        
        z.mostra();
    
        System.out.println("Memoria svuotata");
        z.mostra();
    }
}