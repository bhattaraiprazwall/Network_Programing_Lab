import java.net.*;

public class HeaderInfo_19 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        URLConnection connection = url.openConnection();

        System.out.println("Content Type: " + connection.getContentType());
        System.out.println("Content Length: " + connection.getContentLength());
        System.out.println("Date: " + connection.getDate());
    }
}
