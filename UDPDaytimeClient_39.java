// UDPDaytimeClient.java
import java.net.*;

public class UDPDaytimeClient_39{
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverIP = InetAddress.getByName("localhost");
            byte[] sendData = new byte[1]; // Empty request
            byte[] receiveData = new byte[1024];

            // Send request to server
            DatagramPacket request = new DatagramPacket(sendData, sendData.length, serverIP, 9999);
            socket.send(request);

            // Receive response
            DatagramPacket response = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(response);

            String time = new String(response.getData(), 0, response.getLength());
            System.out.println("Time from server: " + time);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
