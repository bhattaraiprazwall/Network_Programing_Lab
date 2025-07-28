import java.net.*;
import java.util.*;

public class PrintHTTPHeader_22 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        URLConnection conn = url.openConnection();
        Map<String, List<String>> headers = conn.getHeaderFields();

        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
