import java.net.*;
import java.util.*;

public class GetIPFromInterface_7
 {
    public static void main(String[] args) throws SocketException {
        // Replace "wlan0" with your actual interface name like "eth0" or "en0"
        NetworkInterface ni = NetworkInterface.getByName("wireless_32768");

        if (ni != null) {
            Enumeration<InetAddress> addresses = ni.getInetAddresses();
            while (addresses.hasMoreElements()) {
                InetAddress ip = addresses.nextElement();
                if (!ip.isLoopbackAddress() && ip instanceof Inet4Address) {
                    System.out.println("IP Address: " + ip.getHostAddress());
                }
            }
        } else {
            System.out.println("No such interface found!");
        }
    }
}
