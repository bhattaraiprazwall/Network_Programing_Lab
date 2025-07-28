import java.net.*;
import java.nio.*;
import java.nio.channels.*;

public class NioTCPClient_37{
    public static void main(String[] args) throws Exception {
        SocketChannel socket = SocketChannel.open(new InetSocketAddress("localhost", 9000));
        socket.write(ByteBuffer.wrap("Hello from Client".getBytes()));
        ByteBuffer buffer = ByteBuffer.allocate(256);
        socket.read(buffer);
        System.out.println("Server: " + new String(buffer.array()).trim());
        socket.close();
    }
}
