package JP;

//Peak element
import java.util.*;
import java.io.*;

class Assignment210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Peak elements are: ");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                }
            } else if (i == n - 1) {
                if (arr[i] > arr[i - 1]) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
