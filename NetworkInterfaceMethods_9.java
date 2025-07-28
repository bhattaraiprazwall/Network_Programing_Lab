import java.net.*;
public class NetworkInterfaceMethods_9
 {
    public static void main(String[] args) throws SocketException {
        NetworkInterface ni = NetworkInterface.getByName("wireless_32768");
        System.out.println("Name: " + ni.getName());
        System.out.println("Display Name: " + ni.getDisplayName());
        System.out.println("Is Up: " + ni.isUp());
        System.out.println("Is Loopback: " + ni.isLoopback());
    }
}
