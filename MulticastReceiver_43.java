import java.net.*;

public class MulticastReceiver_43 {
    public static void main(String[] args) throws Exception {
        MulticastSocket socket = new MulticastSocket(4446);
        InetAddress group = InetAddress.getByName("230.0.0.1");
        socket.joinGroup(group);

        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);

        System.out.println("Received: " + new String(packet.getData(), 0, packet.getLength()));
        socket.leaveGroup(group);
        socket.close();
    }
}
