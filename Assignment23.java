package JP;

import java.util.*;
import java.io.*;

class Assignment23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int secmin = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                secmin = min;
                min = arr[i];
            }
        }
        if (min == arr[0]) {
            secmin = arr[1];
            for (int i = 1; i < n; i++) {
                if (secmin > arr[i]) {
                    secmin = arr[i];
                }
            }
        }
        System.out.println("Second minimum element is " + secmin);
    }
}
