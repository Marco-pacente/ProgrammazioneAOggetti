import java.io.*;

public class FileRead{
    public static void main(String[] args) {
        try{
            BufferedReader in = new BufferedReader(new FileReader("test.txt"));
            String line = null;
            while ((line = in.readLine())!=null) {
                Integer.parseInt(line);
            }
            System.out.println("Il file contiene solo interi");
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File non trovato");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Il file contiene anche non interi");
        }
    }
}