// DaytimeClient.java
import java.net.*;
import java.io.*;

public class DaytimeClient_27{
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Server Time: " + in.readLine());
        socket.close();
    }
}
