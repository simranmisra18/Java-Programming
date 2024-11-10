package JP;

import java.io.*;
import java.util.*;

class Node {
    int coeff, exp;
    Node next;

    Node() {
    }

    Node(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
        this.next = null;
    }
}

class List extends Node {
    Node temp1, listptr1, temp2, listptr2, temp3, listptr3;
    Scanner s = new Scanner(System.in);

    List() {
        temp1 = null;
        listptr1 = null;
        temp2 = null;
        listptr2 = null;
        temp3 = null;
        listptr3 = null;
    }

    void create() {
        char ch = 'y';
        System.out.println("Enter first polynomial:");
        while (ch == 'y') {
            System.out.println("Enter coefficient:");
            int coeff1 = s.nextInt();
            System.out.println("Enter exponent:");
            int exp1 = s.nextInt();
            Node newnode1 = new Node(coeff1, exp1);
            if (listptr1 == null) {
                listptr1 = newnode1;
                temp1 = newnode1;
            } else {
                temp1.next = newnode1;
                temp1 = temp1.next;
            }
            System.out.println("Do you want to enter another term?\nYes:y\nNo:n");
            ch = s.next().charAt(0);
        }
        ch = 'y';
        System.out.println("Enter second polynomial:");
        while (ch == 'y') {
            System.out.println("Enter coefficient:");
            int coeff2 = s.nextInt();
            System.out.println("Enter exponent:");
            int exp2 = s.nextInt();
            Node newnode2 = new Node(coeff2, exp2);
            if (listptr2 == null) {
                listptr2 = newnode2;
                temp2 = newnode2;
            } else {
                temp2.next = newnode2;
                temp2 = temp2.next;
            }
            System.out.println("Do you want to enter another term?\nYes:y\nNo:n");
            ch = s.next().charAt(0);
        }
    }

    void display() {
        System.out.println("\nFirst polynomial:");
        temp1 = listptr1;
        while (temp1 != null) {
            if (temp1.exp == 0) {
                System.out.print(temp1.coeff);
            } else {
                System.out.print(temp1.coeff + "x^" + temp1.exp + "+");
            }
            temp1 = temp1.next;
        }
        System.out.println("\nSecond polynomial:");
        temp2 = listptr2;
        while (temp2 != null) {
            if (temp2.exp == 0) {
                System.out.print(temp2.coeff);
            } else {
                System.out.print(temp2.coeff + "x^" + temp2.exp + "+");
            }
            temp2 = temp2.next;
        }
    }

    void add() {
        temp1 = listptr1;
        temp2 = listptr2;
        while (temp1 != null && temp2 != null) {
            if (temp1.exp > temp2.exp) {
                System.out.print(temp1.coeff + "x^" + temp1.exp + "+");
                temp1 = temp1.next;
            } else if (temp2.exp > temp1.exp) {
                System.out.print(temp2.coeff + "x^" + temp2.exp + "+");
                temp2 = temp2.next;
            } else {
                System.out.print((temp1.coeff + temp2.coeff) + "x^" + temp2.exp + "+");
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
        }
        while (temp1 != null) {
            System.out.print(temp1.coeff + "x^" + temp1.exp + "+");
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            System.out.print(temp2.coeff + "x^" + temp2.exp + "+");
            temp2 = temp2.next;
        }
        System.out.println("0");
    }

    void multiply() {
        temp1 = listptr1;
        temp2 = listptr2;
        while (temp1 != null) {
            temp2 = listptr2;
            while (temp2 != null) {
                Node newnode3 = new Node();
                newnode3.coeff = temp1.coeff * temp2.coeff;
                newnode3.exp = temp1.exp + temp2.exp;
                if (listptr3 == null) {
                    listptr3 = newnode3;
                    temp3 = newnode3;
                } else {
                    temp3.next = newnode3;
                    temp3 = temp3.next;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        temp3 = listptr3;
        while (temp3.next != null) {
            if (temp3.exp == temp3.next.exp) {
                temp3.coeff = temp3.coeff + temp3.next.coeff;
                temp3.next = temp3.next.next;
            }
            temp3 = temp3.next;
        }
        System.out.println("Polynomial is:");
        temp3 = listptr3;
        while (temp3 != null) {
            System.out.print(temp3.coeff + "x^" + temp3.exp + "+");
            temp3 = temp3.next;
        }
        System.out.println("0");
    }
}

class Assignment5 {
    public static void main(String[] args) {
        List l = new List();
        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        while (ch == 'y') {
            System.out.println("Enter the option:\n1)Create\n2)Display\n3)Add\n4)Multiply");
            int f = sc.nextInt();
            switch (f) {
                case 1:
                    System.out.println("Create:");
                    l.create();
                    System.out.println("Created.");
                    break;
                case 2:
                    System.out.println("Display:");
                    l.display();
                    break;
                case 3:
                    System.out.println("Add:");
                    l.add();
                    break;
                case 4:
                    System.out.println("Multiply:");
                    l.multiply();
                    break;
                default:
                    System.out.println("Enter the correct option.");
            }
            System.out.println("\nDo you want to continue?\nYes:y\nNo:n");
            ch = sc.next().charAt(0);
        }

    }
}
