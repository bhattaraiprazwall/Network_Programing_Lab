import java.rmi.*;

public class GCDServerMain {
    public static void main(String[] args) {
        try {
            GCDService service = new GCDServer();
            Naming.rebind("rmi://localhost:5000/gcd", service);
            System.out.println("GCD RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
