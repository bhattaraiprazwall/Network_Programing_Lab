
// TextServer.java
import java.net.*;
import java.io.*;

public class TextServer_28{
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(7000);
        Socket client = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        String msg;
        while ((msg = in.readLine()) != null) {
            System.out.println("Client: " + msg);
            out.println("Received: " + msg);
        }
        client.close();
        server.close();
    }
}
