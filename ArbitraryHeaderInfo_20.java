import java.net.*;

public class ArbitraryHeaderInfo_20 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        URLConnection connection = url.openConnection();

        System.out.println("Server: " + connection.getHeaderField("Server"));
        System.out.println("Content-Encoding: " + connection.getHeaderField("Content-Encoding"));
        System.out.println("Cache-Control: " + connection.getHeaderField("Cache-Control"));
    }
}
