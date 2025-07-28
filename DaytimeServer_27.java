// DaytimeServer.java
import java.net.*;
import java.io.*;
import java.util.*;

public class DaytimeServer_27{
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(6000);
        Socket client = server.accept();
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println(new Date().toString());
        client.close();
        server.close();
    }
}
