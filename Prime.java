package JP;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.rmi.*;

public interface Prime extends Remote {
    public int isPrime(int n) throws RemoteException;
}
