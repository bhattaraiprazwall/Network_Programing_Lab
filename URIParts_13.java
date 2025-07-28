import java.net.*;

public class URIParts_13
 {
    public static void main(String[] args) throws URISyntaxException {
        URI uri = new URI("https://example.com:443/path/page.html?user=test#section1");
        System.out.println("Scheme: " + uri.getScheme());
        System.out.println("Host: " + uri.getHost());
        System.out.println("Port: " + uri.getPort());
        System.out.println("Path: " + uri.getPath());
        System.out.println("Query: " + uri.getQuery());
        System.out.println("Fragment: " + uri.getFragment());
    }
}
