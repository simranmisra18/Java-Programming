package JP;

import java.util.ArrayList;
import java.rmi.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyClient {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
            Prime number = (Prime) Naming.lookup("rmi://localhost:5000/jp_rmi");
            System.out.println("Enter the number:");
            int n = scan.nextInt();
            if (number.isPrime(n) == 1)
                System.out.println(n + " is a Prime number");
            else
                System.out.println(n + " is a Composite number");
        } catch (Exception e) {
        }
    }
}
