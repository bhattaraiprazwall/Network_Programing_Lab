    
import java.net.InetAddress;
public class CheckIP_4 {
    public static void main(String[] args)throws Exception {
        InetAddress ip1=InetAddress.getByName("2a03:2880:f10c:83:face:b00c:0:25de");
        byte [] add =ip1.getAddress();
        if(add.length==4)
        {
            System.out.println("IPV4 ADDRESS");
        } 
        else if(add.length==16){
            System.out.println("IPV6 ADDRESS");
        }
        else
        {
            System.out.println("None");
        }

    }
}
