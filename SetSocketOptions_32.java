import java.net.*;

public class SetSocketOptions_32{
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("www.google.com", 80);
        socket.setSoTimeout(5000);           // Set read timeout to 5 seconds
        socket.setKeepAlive(true);           // Enable keep-alive
        socket.setTcpNoDelay(true);          // Disable Nagle's algorithm
        System.out.println("Options set.");
        socket.close();
    }
}
