import java.net.*;
import java.nio.*;
import java.nio.channels.*;

public class NioTCPServer_37{
    public static void main(String[] args) throws Exception {
        ServerSocketChannel server = ServerSocketChannel.open();
        server.bind(new InetSocketAddress(9000));
        SocketChannel client = server.accept();
        ByteBuffer buffer = ByteBuffer.allocate(256);
        client.read(buffer);
        System.out.println("Client: " + new String(buffer.array()).trim());
        client.write(ByteBuffer.wrap("Hello from Server".getBytes()));
        client.close(); server.close();
    }
}
