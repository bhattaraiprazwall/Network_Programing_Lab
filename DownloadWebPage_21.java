import java.io.*;
import java.net.*;

public class DownloadWebPage_21 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        URLConnection conn = url.openConnection();
        String type = conn.getContentType();
        String charset = type != null && type.contains("charset=") ? type.split("charset=")[1] : "UTF-8";

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));
        String line;
        while ((line = in.readLine()) != null) System.out.println(line);
        in.close();
    }
}
