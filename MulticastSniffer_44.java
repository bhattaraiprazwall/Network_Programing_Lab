import java.net.*;

public class MulticastSniffer_44 {
    public static void main(String[] args) throws Exception {
        MulticastSocket socket = new MulticastSocket(4446);
        InetAddress group = InetAddress.getByName("230.0.0.1");
        socket.joinGroup(group);

        byte[] buffer = new byte[1024];
        System.out.println("Sniffer started. Waiting for multicast packets...");

        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String msg = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + msg);
        }
    }
}
