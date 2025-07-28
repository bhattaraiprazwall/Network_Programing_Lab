import java.net.*;

public class UDPSocketInfo_36{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(5555);
        System.out.println("Local Port: " + socket.getLocalPort());
        System.out.println("Local Address: " + socket.getLocalAddress());
        System.out.println("Is Bound: " + socket.isBound());
        socket.close();
    }
}
