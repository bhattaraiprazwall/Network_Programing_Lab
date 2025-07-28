import java.net.*;

public class InetAddress_2 {
    public static void main(String[] args) {
        try {
            // Get InetAddress object for a hostname
            InetAddress address = InetAddress.getByName("www.google.com");

            // Display various getter methods
            System.out.println("Host Name     : " + address.getHostName());
            System.out.println("Host Address  : " + address.getHostAddress());
            System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
            System.out.println("Is Multicast? : " + address.isMulticastAddress());
            System.out.println("Is Any Local? : " + address.isAnyLocalAddress());
            System.out.println("Is Loopback?  : " + address.isLoopbackAddress());
        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}
