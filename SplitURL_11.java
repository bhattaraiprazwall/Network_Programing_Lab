import java.net.*;

public class SplitURL_11
 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://example.com:443/index.html");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("File: " + url.getFile());
    }
}
