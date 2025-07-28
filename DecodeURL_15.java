import java.net.*;

public class DecodeURL_15 {
    public static void main(String[] args) throws Exception {
        String encoded = "Java+Programming%402025";
        String decoded = URLDecoder.decode(encoded, "UTF-8");
        System.out.println("Decoded: " + decoded);
    }
}
