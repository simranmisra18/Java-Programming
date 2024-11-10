package JP;

import java.io.*;
import java.util.*;
import java.lang.Math;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        while (ch == 'y') {
            System.out.println(
                    "Choose the option:\n1)Add\n2)Subtract\n3)Multiply\n4)Divide\n5)Square Root\n6)Power\n7)Mean\n8)Variance\n9)GCD");
            int f = sc.nextInt();
            switch (f) {
                case 1:
                    System.out.println("\nAddition:");
                    int a1, b1, c1;
                    System.out.println("Enter first number:");
                    a1 = sc.nextInt();
                    System.out.println("Enter second number:");
                    b1 = sc.nextInt();
                    c1 = a1 + b1;
                    System.out.println("Sum=" + c1);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                case 2:
                    System.out.println("Subtraction:");
                    int a2, b2, c2;
                    System.out.println("Enter first number:");
                    a2 = sc.nextInt();
                    System.out.println("Enter second number:");
                    b2 = sc.nextInt();
                    c2 = a2 - b2;
                    System.out.println("Subtraction=" + c2);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                case 3:
                    System.out.println("\nMultiplication:");
                    int a3, b3, c3;
                    System.out.println("Enter first number:");
                    a3 = sc.nextInt();
                    System.out.println("Enter second number:");
                    b3 = sc.nextInt();
                    c3 = a3 * b3;
                    System.out.println("Multiplication=" + c3);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                case 4:
                    System.out.println("\nDivision:");
                    int a4, b4, c4;
                    System.out.println("Enter first number:");
                    a4 = sc.nextInt();
                    System.out.println("Enter second number:");
                    b4 = sc.nextInt();
                    c4 = a4 / b4;
                    System.out.println("Division=" + c4);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                case 5:
                    System.out.println("\nSquare root:");
                    double a5, c5;
                    System.out.println("Enter the number:");
                    a5 = sc.nextDouble();
                    c5 = Math.sqrt(a5);
                    System.out.println("Square root=" + c5);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                case 6:
                    System.out.println("\nPower:");
                    double a6, b6, c6;
                    System.out.println("Enter the number:");
                    a6 = sc.nextDouble();
                    System.out.println("Enter the power:");
                    b6 = sc.nextDouble();
                    c6 = Math.pow(a6, b6);
                    System.out.println("Power=" + c6);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                case 7:
                    System.out.println("Mean:");
                    int i7, n;
                    double mean, a7, c7 = 0;
                    System.out.println("How many numbers you want to enter?");
                    n = sc.nextInt();
                    for (i7 = 0; i7 < n; i7++) {
                        System.out.println("Enter number:");
                        a7 = sc.nextDouble();
                        c7 = c7 + a7;
                    }
                    mean = c7 / n;
                    System.out.println("Mean=" + mean);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                case 8:
                    System.out.println("Variance:");
                    int i8, n2;
                    double variance = 0, a8, c8, mean2 = 0;
                    System.out.println("How many numbers you want to enter?");
                    n2 = sc.nextInt();
                    for (i8 = 1; i8 <= n2; i8++) {
                        System.out.println("Enter number:");
                        a8 = sc.nextDouble();
                        mean2 = mean2 + a8;
                        variance = variance + (a8 * i8);
                    }
                    c8 = (variance - (mean2 * mean2)) / n2;
                    System.out.println("Variance=" + c8);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                case 9:
                    System.out.println("GCD:");
                    int a9, b9, rem = 1;
                    System.out.println("Enter first number:");
                    a9 = sc.nextInt();
                    System.out.println("Enter second number:");
                    b9 = sc.nextInt();
                    while (rem != 0) {
                        rem = a9 % b9;
                        a9 = b9;
                        b9 = rem;
                    }
                    System.out.println("GCD=" + a9);
                    System.out.println("\nDo you want to continue?");
                    ch = sc.next().charAt(0);
                    break;
                default:
                    System.out.println("Enter the correct option.");
            }
        }
    }
}
