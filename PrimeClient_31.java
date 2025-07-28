// PrimeClient.java
import java.net.*; import java.io.*;

public class PrimeClient_31{
    public static void main(String[] a) throws Exception {
        Socket s = new Socket("localhost", 9000);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("11"); // change to test other numbers
        System.out.println(in.readLine());
        s.close();
    }
}
