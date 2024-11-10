package JP;

//Factorial
import java.io.*;
import java.util.*;

class Assignment81 {
    void factorial(int n) throws MyExcep {
        int fact = 1;
        if (n < 0 || n > 12) {
            throw new MyExcep(n);
        } else {
            if (n == 0) {
                fact = 1;
            } else {
                for (int i = n; i >= 1; i--) {
                    fact = fact * i;
                }
            }
            System.out.println("Factorial=" + fact);
        }
    }

    public static void main(String[] args) throws Exception {
        String s = " ";
        int num;
        Scanner sc = new Scanner(System.in);
        Assignment81 a = new Assignment81();
        try {
            System.out.println("Enter the number:");
            s = sc.next();
            num = Integer.parseInt(s);
            a.factorial(num);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

class MyExcep extends Exception {
    MyExcep(int n) {
        System.out.println("Error as number entered is " + n);
    }
}
