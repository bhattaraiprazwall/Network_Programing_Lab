import javax.net.ssl.*;
import java.io.*;

public class SSLServer_35{
    public static void main(String[] args) throws Exception {
        System.setProperty("javax.net.ssl.keyStore", "server.keystore");
        System.setProperty("javax.net.ssl.keyStorePassword", "password");

        SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        SSLServerSocket server = (SSLServerSocket) ssf.createServerSocket(9999);
        SSLSocket client = (SSLSocket) server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println("Secure Hello from Server!");
        System.out.println("Client said: " + in.readLine());

        client.close(); server.close();
    }
}
