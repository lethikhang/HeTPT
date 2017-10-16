import java.rmi.*;

public interface Interface extends Remote
{

    public String getGreetingMessage(int []args ) throws RemoteException;
    
}