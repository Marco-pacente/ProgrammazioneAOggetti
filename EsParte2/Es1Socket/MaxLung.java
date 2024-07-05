public class MaxLung {
    public static String SMax = "";
    public static synchronized void aggiorna(String s){
        if (s.length() > SMax.length()) {
            SMax = s;
        }
    }
}