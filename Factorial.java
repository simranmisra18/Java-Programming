package JP;

import java.util.*;
import java.io.*;

class Factorial {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        char ch = 'y';
        int i;
        while (ch == 'y') {
            System.out.println("Choose the option:\n1)Scanner\n2)BufferedReader\n3)Console");
            int f = sc.nextInt();
            int fact = 1;
            switch (f) {
                case 1:
                    System.out.println("\nScanner:");
                    System.out.println("\nEnter the number:");
                    int n1 = sc.nextInt();
                    for (i = n1; i > 0; i--) {
                        fact = fact * i;
                    }
                    System.out.println("\nFactorial=" + fact);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                case 2:
                    System.out.println("\nBufferedReader:");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("\nEnter the number:");
                    int n2 = Integer.parseInt(br.readLine());
                    for (i = n2; i > 0; i--) {
                        fact = fact * i;
                    }
                    System.out.println("\nFactorial=" + fact);
                    System.out.println("\nDo you want to continue?");
                    ch = (char) br.read();
                    break;
                case 3:
                    System.out.println("\nConsole:");
                    System.out.println("\nEnter the number:");
                    int n3 = Integer.parseInt(System.console().readLine());
                    for (i = n3; i > 0; i--) {
                        fact = fact * i;
                    }
                    System.out.println("\nFactorial=" + fact);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                default:
                    System.out.println("\nEnter the correct option.");
            }
        }
    }
}
