import java.io.*;
public class MediaFile2{
    public static double media2(String nome) throws IOException{
        double s = 0;
        int n = 0;
        try(FileReader fr = new FileReader(nome)){
            BufferedReader infile = new BufferedReader(fr);
            String linea;
            while ((linea = infile.readLine())!=null) {
                System.out.println(linea);
                try{
                    s += Double.parseDouble(linea);
                    n++;
                }catch(NumberFormatException e){
                    System.out.println("Non numero trovato: " + linea);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("file non trovato");
            throw e;
        }
        catch(IOException e){
            System.out.println("Errore: " + e.getMessage());
        }

        if (n!=0) {
            return s/n;
        }else{
            System.out.println("File vuoto");
            return 0;
        }

    }
}