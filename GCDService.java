import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GCDService extends Remote {
    int computeGCD(int a, int b) throws RemoteException;
}
