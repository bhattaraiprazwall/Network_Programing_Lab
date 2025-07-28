// MulticastSender.java
import java.net.*;

public class MulticastSender_44 {
    public static void main(String[] args) throws Exception {
        MulticastSocket socket = new MulticastSocket();
        String message = "Hello Multicast!";
        byte[] buffer = message.getBytes();
        InetAddress group = InetAddress.getByName("230.0.0.1");

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, 4446);
        socket.send(packet);
        socket.close();
    }
}
