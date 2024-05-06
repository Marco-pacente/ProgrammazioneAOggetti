import java.io.*;

public class App {
    public static void main(String[] args) {
        try{
            System.out.println("media: " + MediaFile2.media2("file.txt"));
        }catch(IOException e){
            System.out.println("file not found");
        }
    }
}