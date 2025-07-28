import java.net.*;

public class GetMACFromIP_8 {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(ip);
        byte[] mac = ni.getHardwareAddress();

        for (int i = 0; i < mac.length; i++) {
            System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
        }
    }
}
