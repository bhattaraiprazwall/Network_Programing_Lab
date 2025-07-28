// PrimeServer.java
import java.net.*; import java.io.*;

public class PrimeServer_31{
    public static void main(String[] a) throws Exception {
        ServerSocket ss = new ServerSocket(9000);
        while (true) {
            Socket s = ss.accept();
            new Thread(() -> {
                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                    int n = Integer.parseInt(in.readLine());
                    boolean p = n > 1;
                    for (int i = 2; i <= Math.sqrt(n) && p; i++) if (n % i == 0) p = false;
                    out.println(p ? "Prime" : "Not Prime");
                    s.close();
                } catch (Exception e) {}
            }).start();
        }
    }
}
