import java.net.*;

public class IPAddressTypeChecker_3 {
    public static void main(String[] args) {
        try {
            // Replace with any IP or host (e.g., "127.0.0.1", "192.168.1.1", "www.google.com")
            InetAddress address = InetAddress.getByName("127.0.0.1");

            System.out.println("IP Address: " + address.getHostAddress());

            // Check characteristics
            System.out.println("Is Any Local Address?  : " + address.isAnyLocalAddress());
            System.out.println("Is Loopback Address?   : " + address.isLoopbackAddress());
            System.out.println("Is Link Local Address? : " + address.isLinkLocalAddress());
            System.out.println("Is Site Local Address? : " + address.isSiteLocalAddress());
            System.out.println("Is Multicast Address?  : " + address.isMulticastAddress());
            System.out.println("Is Global Multicast?   : " + address.isMCGlobal());
            System.out.println("Is Node Local Multicast? : " + address.isMCNodeLocal());
            System.out.println("Is Link Local Multicast? : " + address.isMCLinkLocal());
            System.out.println("Is Site Local Multicast? : " + address.isMCSiteLocal());
            System.out.println("Is Organization Local Multicast? : " + address.isMCOrgLocal());

        } catch (UnknownHostException e) {
            System.out.println("Invalid host: " + e.getMessage());
        }
    }
}
