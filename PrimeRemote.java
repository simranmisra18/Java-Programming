package JP;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.rmi.*;
import java.rmi.server.*;

public class PrimeRemote extends UnicastRemoteObject implements Prime {
    PrimeRemote() throws RemoteException {
        super();
    }

    public int isPrime(int n) {
        System.out.println("Evaluating " + n);
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return 0;
        return 1;
    }
}
