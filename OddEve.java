package JP;

import java.io.*;
import java.util.*;

class Oddeve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] odd = new int[50];
        int[] even = new int[50];
        System.out.println("Enter the number of values to be enetered:");
        int n = sc.nextInt();
        int j = 0, k = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();
            if (num % 2 == 0) {
                even[j] = num;
                j++;
            } else {
                odd[k] = num;
                k++;
            }
        }
        System.out.println("Odd array:");
        for (int i = 0; i < k; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println("\nEven array:");
        for (int i = 0; i < j; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
