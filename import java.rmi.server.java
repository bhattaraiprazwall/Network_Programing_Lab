import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class GCDServer_45 extends UnicastRemoteObject implements GCDService {
    protected GCDServer() throws RemoteException {
        super();
    }

    public int computeGCD(int a, int b) throws RemoteException {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
