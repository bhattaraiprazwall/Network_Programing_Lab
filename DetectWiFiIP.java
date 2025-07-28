import java.net.*;
import java.util.*;

public class DetectWiFiIP {
    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            String name = ni.getDisplayName().toLowerCase();
            String internalName = ni.getName().toLowerCase();

            // Filter likely WiFi interfaces
            if ((name.contains("wireless") || internalName.contains("wireless") || name.contains("wi") || internalName.contains("wi")) 
                && ni.isUp() && !ni.isLoopback()) {

                Enumeration<InetAddress> addresses = ni.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress ip = addresses.nextElement();
                    if (ip instanceof Inet4Address && !ip.isLoopbackAddress()) {
                        System.out.println("Interface: " + ni.getDisplayName());
                        System.out.println("IP Address: " + ip.getHostAddress());
                        return;
                    }
                }
            }
        }

        System.out.println("No active WiFi IP address found.");
    }
}
