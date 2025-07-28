import java.net.*;

public class SetServerSocketOptions_33{
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket();
        server.setReuseAddress(true);         // Allows address reuse
        server.bind(new InetSocketAddress(8000));
        server.setSoTimeout(10000);           // Set accept timeout to 10 seconds
        System.out.println("Server socket options set.");
        server.close();
    }
}
