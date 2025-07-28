import java.net.*;

public class EncodeURL_14
 {
    public static void main(String[] args) throws Exception {
        String text = "Java Programming@2025";
        String encoded = URLEncoder.encode(text, "UTF-8");
        System.out.println("Encoded: " + encoded);
    }
}
