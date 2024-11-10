package JP;

//Converting java program from array to arraylist
import java.util.*;
import java.io.*;

class Assignment24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list1.add(arr[i]);
        }
        System.out.println("Array list is:" + list1);

    }
}
