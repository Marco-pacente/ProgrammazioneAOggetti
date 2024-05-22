import java.io.*;
public class App{
    static int verifica(String nomeFile, int N){
        int numeroMaggiori = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader(nomeFile));
            int v;
            String line = null;
            while ((line = in.readLine())!=null) {
                v = Integer.parseInt(in.readLine());
                if (v >= N) {
                    numeroMaggiori++;
                }
            }
            in.close();
            return numeroMaggiori;
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato");
            return -1;
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            return -1;
        }
        catch(NumberFormatException e){
            System.out.println("File non ben formattato");
            return -1;
        }
    }
    public static void main(String[] args) {
        int n =  verifica("esame.txt", 18);
        if (n != -1) {
            System.out.println("numero passati all'esame: " + n);
        }
    }
}