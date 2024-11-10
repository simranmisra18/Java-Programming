package JP;

import java.io.*;
import java.util.*;
import java.lang.Math;

class Assignment22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Math.abs(arr[0] - arr[1]);
        int pos = 0;
        for (int i = 0; i < n - 1; i++) {
            if (min > Math.abs(arr[i] - arr[i + 1])) {
                min = arr[i] - arr[i + 1];
                pos = i;
            }
        }
        System.out.println("Minimum difference is " + min + " at position " + pos);
    }
}
