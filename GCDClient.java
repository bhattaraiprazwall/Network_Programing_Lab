import java.rmi.Naming;
import java.util.Scanner;

public class GCDClient {
    public static void main(String[] args) {
        try {
            GCDService service = (GCDService) Naming.lookup("rmi://localhost:5000/gcd");
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = service.computeGCD(a, b);
            System.out.println("GCD is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
