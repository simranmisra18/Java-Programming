package JP;

//Rational number operations
import java.io.*;
import java.util.*;

class Assignment7 {
    Scanner s = new Scanner(System.in);
    int num1, den1, num2, den2;

    void accept() {
        System.out.println("Enter numerator and denominator of first rational number:");
        num1 = s.nextInt();
        den1 = s.nextInt();
        System.out.println("Enter numerator and denominator of second rational number:");
        num2 = s.nextInt();
        den2 = s.nextInt();

    }

    void add() {
        int num = (num1 * den2) + (num2 * den1);
        int den = den1 * den2;
        int GCD = gcd(num, den);
        try {
            num = num / GCD;
            den = den / GCD;
        } catch (Exception e) {
            System.out.println("Division by 0 error. So, answer displayed is 1.");
            num = 1;
            den = 1;
        }
        System.out.println("Addition=" + num + "/" + den);
    }

    void subtract() {
        int num = (num1 * den2) - (num2 * den1);
        int den = den1 * den2;
        int GCD = gcd(num, den);
        try {
            num = num / GCD;
            den = den / GCD;
        } catch (Exception e) {
            System.out.println("Division by 0 error. So, answer displayed is 1.");
            num = 1;
            den = 1;
        }
        System.out.println("Subtraction=" + num + "/" + den);
    }

    void multiply() {
        int num = num1 * num2;
        int den = den1 * den2;
        int GCD = gcd(num, den);
        try {
            num = num / GCD;
            den = den / GCD;
        } catch (Exception e) {
            System.out.println("Division by 0 error. So, answer displayed is 1.");
            num = 1;
            den = 1;
        }
        System.out.println("Multiplication=" + num + "/" + den);
    }

    void divide() {
        int num = num1 * den2;
        int den = den1 * num2;
        int GCD = gcd(num, den);
        try {
            num = num / GCD;
            den = den / GCD;
        } catch (Exception e) {
            System.out.println("Division by 0 error. So, answer displayed is 1.");
            num = 1;
            den = 1;
        }
        System.out.println("Division=" + num + "/" + den);
    }

    void compare() {
        int cnum1 = num1 * den2;
        int cnum2 = num2 * den1;
        if (cnum1 > cnum2) {
            System.out.println(num1 + "/" + den1 + " is greater than " + num2 + "/" + den2);
        } else if (cnum1 < cnum2) {
            System.out.println(num1 + "/" + den1 + " is smaller than " + num2 + "/" + den2);
        } else {
            System.out.println(num1 + "/" + den1 + " is equal to " + num2 + "/" + den2);
        }
    }

    void floatingpoint() {
        double num;
        try {
            num = (float) num1 / (float) den1;
        } catch (Exception e) {
            System.out.println("Divide by 0 error. Enter denominator again:");
            den1 = s.nextInt();
            num = (float) num1 / (float) den1;
        }
        if (num >= 1) {
            int pow = 0, n;
            n = (int) num;
            while (n != 0) {
                n = n / 10;
                num = num / 10;
                pow++;
            }
            System.out.println("Floating point=" + (num * 10) + "*10^" + (pow - 1));
        } else {
            int pow = 0, n;
            n = (int) num;
            while (n == 0) {
                num = num * 10;
                n = (int) num;
                pow--;
            }
            System.out.println("Floating point=" + num + "*10^" + pow);
        }

    }

    int gcd(int a, int b) {
        int rem = 1;
        try {
            rem = a % b;
        } catch (Exception e) {
            System.out.println("Divide by 0 error.");
            return 0;
        }
        while (rem != 0) {
            rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    void absolute() {
        float num;
        try {
            num = (float) num1 / (float) den1;
        } catch (Exception e) {
            System.out.println("Divide by 0 error. Enter the denominator again:");
            den1 = s.nextInt();
            num = (float) num1 / (float) den1;
        }
        if (num >= 0) {
            System.out.println("Absolute value=" + num);
        } else {
            num = num * (-1);
            System.out.println("Absolute value=" + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment7 a = new Assignment7();
        int num1, den1, num2, den2;
        char ch = 'y';
        while (ch == 'y') {
            System.out.println(
                    "Enter the choice:\n1)Accept rational numbers\n2)Add\n3)Subtract\n4)Multiply\n5)Division\n6)Compare\n7)Coversion to floating point\n8)Absolute value");
            int f = sc.nextInt();
            switch (f) {
                case 1:
                    System.out.println("Accept rational numbers:");
                    a.accept();
                    break;
                case 2:
                    System.out.println("Add rational numbers:");
                    a.add();
                    break;
                case 3:
                    System.out.println("Subtract rational numbers:");
                    a.subtract();
                    break;
                case 4:
                    System.out.println("Multiply rational numbers:");
                    a.multiply();
                    break;
                case 5:
                    System.out.println("Divide rational numbers:");
                    a.divide();
                    break;
                case 6:
                    System.out.println("Compare rational numbers:");
                    a.compare();
                    break;
                case 7:
                    System.out.println("Conversion to floating point:");
                    a.floatingpoint();
                    break;
                case 8:
                    System.out.println("Absolute value:");
                    a.absolute();
                    break;
                default:
                    System.out.println("Enter the correct option.");
            }
            System.out.println("Do you want to continue?\nYes:y\nNo:n");
            ch = sc.next().charAt(0);
        }
    }
}
