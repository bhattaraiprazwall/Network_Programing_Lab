import java.net.*;

public class UDPSocketOptions_42{
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket
            DatagramSocket socket = new DatagramSocket();

            // Set socket options
            socket.setSoTimeout(3000); // Set timeout to 3000 ms (3 seconds)
            socket.setReuseAddress(true); // Allow address reuse
            socket.setReceiveBufferSize(4096); // Set receive buffer size
            socket.setSendBufferSize(4096);    // Set send buffer size
            socket.setTrafficClass(0x10); // Set traffic class (Type of Service) - low delay

            // Print out the settings
            System.out.println("Socket Timeout: " + socket.getSoTimeout());
            System.out.println("Reuse Address: " + socket.getReuseAddress());
            System.out.println("Receive Buffer Size: " + socket.getReceiveBufferSize());
            System.out.println("Send Buffer Size: " + socket.getSendBufferSize());

            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
