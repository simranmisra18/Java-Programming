package JP.pkg_Stack.IntStack;

import java.util.*;
import java.io.*;

class Fixed_stk extends IntStack {
    Scanner sc = new Scanner(System.in);

    void create() {
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        push1(num);
    }

    void deletes() {
        pop1();
    }

    void display() {
        System.out.println("Stack is:");
        for (int i = 0; i <= top1; i++) {
            System.out.print(data[i] + " ");
        }
    }
}

class Growable_stk extends IntStack {
    Scanner s = new Scanner(System.in);

    void create() {
        System.out.println("Enter the number:");
        int num = s.nextInt();
        push2(num);
    }

    void deletes() {
        pop2();
    }

    void display() {
        System.out.println("Stack is:" + list);
    }
}

class Assignment63 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Fixed_stk f = new Fixed_stk();
        Growable_stk g = new Growable_stk();
        int f1;
        char ch = 'y';
        while (ch == 'y') {
            System.out.println(
                    "Enter the option:\n1)Create fixed stack\n2)Delete from fixed stack\n3)Display fixed stack\n4)Create growable stack\n5)Delete from growable stack\n6)Display growable stack");
            f1 = s1.nextInt();
            switch (f1) {
                case 1:
                    System.out.println("Create fixed stack:");
                    f.create();
                    System.out.println("Added.");
                    break;
                case 2:
                    System.out.println("Delete from fixed stack:");
                    f.deletes();
                    break;
                case 3:
                    System.out.println("Display fixed stack:");
                    f.display();
                    break;
                case 4:
                    System.out.println("Create growable stack:");
                    g.create();
                    break;
                case 5:
                    System.out.println("Delete from growable stack:");
                    g.deletes();
                    break;
                case 6:
                    System.out.println("Display growable stack:");
                    g.display();
                    break;
                default:
                    System.out.println("Enter the correct option.");
            }
            System.out.println("Do you want to continue?\nYes:y\nNo:n");
            ch = s1.next().charAt(0);
        }
    }
}
