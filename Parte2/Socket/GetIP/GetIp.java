import java.io.IOException;
import java.net.InetAddress;

public class GetIp{
    public static void main(String[] args) {
        try{
            if(args.length > 0){
                String host = args[0];
                InetAddress[] addresses = InetAddress.getAllByName(host);
                for(int i = 0; i < addresses.length; i++){
                    System.out.println(addresses[i]);
                }
            }else{
                InetAddress localHost = InetAddress.getLocalHost();
                System.out.println(localHost);
            }
        }catch(IOException e){}
    }
}