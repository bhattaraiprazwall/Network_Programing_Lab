// UDPClient.java
import java.net.*;
import java.util.Scanner;

public class UDPClient_38{
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost"); // or use IP like "127.0.0.1"
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter message to send: ");
            String message = sc.nextLine();

            sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9876);
            clientSocket.send(sendPacket);

            // Receive echo from server
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            String echoedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Echoed from server: " + echoedMessage);

            clientSocket.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
