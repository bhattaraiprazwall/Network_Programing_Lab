// FactorialServer.java
import java.net.*;
import java.io.*;

public class FactorialServer_29
{
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8000);
        Socket client = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        String input;
        while ((input = in.readLine()) != null) {
            int n = Integer.parseInt(input);
            long fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            out.println("Factorial: " + fact);
        }
        client.close();
        server.close();
    }
}
