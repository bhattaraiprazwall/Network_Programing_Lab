// FactorialClient.java
import java.net.*;
import java.io.*;

public class FactorialClient_29{
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8000);
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String num;
        while ((num = user.readLine()) != null) {
            out.println(num);
            System.out.println(in.readLine());
        }       
        socket.close();
    }
}
