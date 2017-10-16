import java.rmi.*;
import java.rmi.server.*;

public class Implementation extends UnicastRemoteObject
        implements Interface {

      
        public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Implementation() throws RemoteException {
        //There is no action need in this moment.
    }
    
    @Override
    public String getGreetingMessage(int []a) throws RemoteException {
       int n = a.length;
       String s="";
        for(int i=0;i<n;i++)
        {
        	if(isPrimeNumber(a[i]))
        	s = s + a[i] +" ";
        }
        return s;
    }
}
