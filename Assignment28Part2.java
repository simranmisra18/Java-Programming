package JP;

//Quick Sort
import java.util.*;
import java.io.*;

class Assignment28Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the elements of array list:");
        char ch = 'y';
        while (ch == 'y') {
            list.add(sc.nextInt());
            System.out.println("Do you want to continue?\nYes:y\nNo:n");
            ch = sc.next().charAt(0);
        }
        Assignment28Part2 a = new Assignment28Part2();
        a.quicksort(list, 0, list.size() - 1);
        System.out.println("Sorted arraylist is: " + list);
    }

    void quicksort(List<Integer> list, int p, int r) {
        int q;
        if (p < r) {
            q = partion(list, p, r);
            quicksort(list, p, q - 1);
            quicksort(list, q + 1, r);
        }

    }

    int partion(List<Integer> list, int p, int r) {
        int pivot, i, j, t;
        pivot = list.get(r);
        i = p - 1;
        for (j = p; j <= r - 1; j++) {
            if (list.get(j) < pivot) {
                i++;
                t = list.get(i);
                list.set(i, list.get(j));
                list.set(j, t);

            }
        }
        t = list.get(i + 1);
        list.set(i + 1, list.get(r));
        list.set(r, t);
        return (i + 1);
    }
}
