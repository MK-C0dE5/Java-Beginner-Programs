import java.rmi.*;
public interface rmi extends Remote{
	public int add(int x, int y) throws RemoteException;
	}

