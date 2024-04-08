public class App {
    public static void main(String[] args) {
        
        Ogg1 ogg = new Ogg2();
        ogg.attr1 = 6;
        ((Ogg2)ogg).attr2 = 3; //qui si specifica al compilatore come leggere l'oggetto, ma non viene trasformato
        
        double d = 2.5;
        System.out.println("(int) 2.5 = " + (int) d); //si stampa la parte intera di d
        //qui c'è un'effettiva "trasformazione" del dato
        
        String s = "12";
        int i = Integer.parseInt(s);
        System.out.println("Integer.parseInt(\"12\") = " + i);
        
        //↓oppure anche (ma vi prego no)

        Integer p = new Integer("12"); //deprecatissimo ma funziona
        //non so se si vedono da github i warning che mi da java ma sono molti

        System.out.println("new Integer(\"12\") = " + p);


    }
}