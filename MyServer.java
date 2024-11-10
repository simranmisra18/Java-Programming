package JP;

import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String args[]) {
        try {
            Prime number = new PrimeRemote();
            Naming.rebind("rmi://localhost:5000/jp_rmi", number);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
