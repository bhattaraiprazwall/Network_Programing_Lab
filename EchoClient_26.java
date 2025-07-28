// EchoClient.java
import java.net.*;
import java.io.*;

public class EchoClient_26{
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 7000);
        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String msg;
        while ((msg = userIn.readLine()) != null) {
            out.println(msg);
            System.out.println(in.readLine());
        }
        socket.close();
    }
}
