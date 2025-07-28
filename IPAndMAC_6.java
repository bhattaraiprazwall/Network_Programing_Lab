import java.net.*;

public class IPAndMAC_6
 {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("IP Address: " + ip.getHostAddress());

        NetworkInterface ni = NetworkInterface.getByInetAddress(ip);
        byte[] mac = ni.getHardwareAddress();

        System.out.print("MAC Address: ");
        for (int i = 0; i < mac.length; i++) {
            System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
        }
    }
}
