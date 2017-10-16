import java.rmi.*;
import java.io.IOException;
import java.util.*; //thu vien dung lop Scanner

public class ClientComponent 
{
    private static final String host = "localhost";

    public static void main(String[] args) 
    {
        
        try 
        {
            //We obtain a reference to the object from the registry and next,
            //it will be typecasted into the most appropiate type.
            Interface greeting_message = (Interface) Naming.lookup("rmi://" 
                    + host + "/Prime");

            //Next, we will use the above reference to invoke the remote
            //object method.

            Scanner inp = new Scanner(System.in);
             int []a;
             int n;

            System.out.print("Nhap so luong phan tu: ");
            n= inp.nextInt();
            a = new int[n];
            for(int i= 0; i<n; i++){
            System.out.print("Nhap phan tu thu "+ (i+1)+ ":") ;
                a[i] = inp.nextInt();

            }
            System.out.println("Ket qua: \n" + 
                    greeting_message.getGreetingMessage(a));
        } 
        catch (ConnectException conEx) 
        {
            System.out.println("Unable to connect to server!");
            System.exit(1);
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            System.exit(1);
        }
    }
}
