import java.net.*;

public class TCPSocketInf_25 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("example.com", 80);

        System.out.println("Remote Address: " + socket.getInetAddress());
        System.out.println("Remote Port: " + socket.getPort());
        System.out.println("Local Address: " + socket.getLocalAddress());
        System.out.println("Local Port: " + socket.getLocalPort());

        socket.close();
    }
}
