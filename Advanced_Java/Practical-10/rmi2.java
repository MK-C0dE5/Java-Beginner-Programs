import java.rmi.*;
import java.rmi.server.*;
public class rmi2 extends UnicastRemoteObject implements rmi{
	rmi2()throws RemoteException{
		super();
	}
	public int add(int x, int y){
		return x+y;
	}
}
