// UDPDaytimeServer.java
import java.net.*;
import java.util.Date;

public class UDPDaytimeServer_39{
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9999); // Server listens on port 9999
            byte[] buffer = new byte[1024];
            System.out.println("Daytime Server running...");

            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                socket.receive(request);

                String currentTime = new Date().toString(); // Get current date and time
                byte[] data = currentTime.getBytes();

                DatagramPacket response = new DatagramPacket(
                    data, data.length,
                    request.getAddress(), request.getPort()
                );

                socket.send(response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
