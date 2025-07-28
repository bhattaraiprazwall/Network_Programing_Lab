import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GCDServer extends UnicastRemoteObject implements GCDService {

    // ✅ Correct constructor — no return type
    protected GCDServer() throws RemoteException {
        super();
    }

    // ✅ Implement the method
    public int computeGCD(int a, int b) throws RemoteException {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
