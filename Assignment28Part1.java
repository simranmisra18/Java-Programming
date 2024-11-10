package JP;

//Buuble sort
import java.util.*;
import java.io.*;

class Assignment28Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        char ch = 'y';
        System.out.println("Enter the elements of array list:");
        while (ch == 'y') {
            list.add(sc.nextInt());
            System.out.println("Do you want to continue?\nYes:y\nNo:n");
            ch = sc.next().charAt(0);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int t = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, t);
                }
            }
        }
        System.out.println("Sorted array list is " + list);
    }
}
