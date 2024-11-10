package JP;

import java.util.*;
import java.io.*;

class Assignment25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        char ch = 'y';
        System.out.println("Enter the elements of array list:");
        while (ch == 'y') {
            list.add(sc.nextInt());
            System.out.println("Do you want to add another element?\nYes:y\nNo:n");
            ch = sc.next().charAt(0);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println("Array is:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
