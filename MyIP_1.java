import java.net.*;

public class MyIP_1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.println("My IP Address is: " + myIP.getHostAddress());
    }
}
