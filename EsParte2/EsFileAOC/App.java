import java.io.*;
public class App{
    public static void main(String[] args){
        String line;
        int n1, n2, n;
        int sum = 0;
        int i, z = 0;
        BufferedReader in = null;
        try{
            in = new BufferedReader(new FileReader("input.txt"));
            while ((line = in.readLine()) != null) {
                z++;
                n1 = -1;
                n2 = -1;
                for(i = 0; i < line.length(); i++){
                    if(line.charAt(i)>='0' && line.charAt(i)<= '9'){
                        n1 = line.charAt(i) - '0';
                        break;
                    }
                }
                for(i = line.length()-1; i >= 0; i--){
                    if(line.charAt(i)>='0' && line.charAt(i)<= '9'){
                        n2 = line.charAt(i) - '0';
                        break;
                    }
                }
                if (n1 == -1 || n2 == -1) {
                    System.out.println("Errore alla riga " + z);
                    in.close();
                    return;
                }
                n = (n1*10) + n2;
                System.out.println("numero: " + n);
                sum += n;
            }
            in.close();
            System.out.println("somma: " + sum);
            
        }catch(FileNotFoundException e ){
            System.out.println("file non trovato");
        }
        catch(EOFException e){
            System.out.println("somma: " + sum);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}