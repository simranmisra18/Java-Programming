package JP;

//Common elements from Three array lists
import java.io.*;
import java.util.*;

class Assignment26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        char ch = 'y';
        System.out.println("Enter the elements of first array list:");
        while (ch == 'y') {
            list1.add(sc.nextInt());
            System.out.println("Do you want to add more elements?\nYes:y\nNo:n");
            ch = sc.next().charAt(0);
        }
        ch = 'y';
        System.out.println("Enter the elements of second array list:");
        while (ch == 'y') {
            list2.add(sc.nextInt());
            System.out.println("Do you want to add more elements?\nYes:y\nNo:n");
            ch = sc.next().charAt(0);
        }
        System.out.println("Enter the elements of third array list:");
        ch = 'y';
        while (ch == 'y') {
            list3.add(sc.nextInt());
            System.out.println("Do you want to add more elements?\nYes:y\nNo:n");
            ch = sc.next().charAt(0);
        }
        System.out.println("List1 sorted:");
        for (int i = 0; i < list1.size() - 1; i++) {
            for (int j = 0; j < list1.size() - i - 1; j++) {
                if (list1.get(j) > list1.get(j + 1)) {
                    int t = list1.get(j);
                    list1.set(j, list1.get(j + 1));
                    list1.set(j + 1, t);
                }
            }
        }
        System.out.println(list1);
        System.out.println("List2 sorted:");
        for (int i = 0; i < list2.size() - 1; i++) {
            for (int j = 0; j < list2.size() - i - 1; j++) {
                if (list2.get(j) > list2.get(j + 1)) {
                    int t = list2.get(j);
                    list2.set(j, list2.get(j + 1));
                    list2.set(j + 1, t);
                }
            }
        }
        System.out.println(list2);
        System.out.println("List3 sorted:");
        for (int i = 0; i < list3.size() - 1; i++) {
            for (int j = 0; j < list3.size() - i - 1; j++) {
                if (list3.get(j) > list3.get(j + 1)) {
                    int t = list3.get(j);
                    list3.set(j, list3.get(j + 1));
                    list3.set(j + 1, t);
                }
            }
        }
        System.out.println(list3);
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                for (int k = 0; k < list3.size(); k++) {
                    if (list1.get(i) == list2.get(j) && list1.get(i) == list3.get(k)) {
                        System.out.print(list3.get(k) + " ");
                    }
                }
            }
        }
    }
}
