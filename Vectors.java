package JP;

import java.util.*;
import java.io.*;

class Employee {
    int id;
    float sal;
    String name, job, org;
    Scanner sc = new Scanner(System.in);

    void add() {
        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Salary: ");
        sal = sc.nextFloat();
        System.out.print("Job Title: ");
        job = sc.next();
        System.out.print("Organisation: ");
        org = sc.next();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
        System.out.println("Job Title: " + job);
        System.out.println("Organisation: " + org);
    }
}

class Vectors {
    public static void main(String args[]) {
        Vector<Employee> e = new Vector<Employee>();
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        Employee t = new Employee();
        Scanner scm = new Scanner(System.in);
        char ans = 'y';
        int x, y, ch, flag = 0;
        int c = 0;
        while (ans == 'y') {
            System.out.print(
                    "\t\t\tMAIN MENU (Employee Record)\n1. Add\n2. Display\n3. Search\n4. Delete\n5. Compare two employees by salary\n6. Sort(by names)\nEnter choice: ");
            ch = scm.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter number of employees you want to add: ");
                    x = scm.nextInt();
                    for (int i = 0; i < x; i++) {
                        System.out.println("Enter details of employee " + (c + 1) + ":");
                        emp.add();
                        e.add(emp);
                        c++;
                    }
                    break;
                case 2:
                    System.out.print("The details of all the employees are:\n");
                    for (int i = 0; i < c; i++) {
                        System.out.println("\nEmployee " + (i + 1) + ":");
                        emp = e.get(i);
                        emp.display();
                    }
                    break;
                case 3:
                    System.out.print("Enter ID of employee you want find: ");
                    x = scm.nextInt();
                    flag = 0;
                    for (int i = 0; i < c; i++) {
                        emp = e.get(i);
                        if (emp.id == x) {
                            flag++;
                            System.out.print("The details of employees with id " + x + " are:\n");
                            emp.display();
                        }
                    }
                    if (flag == 0)
                        System.out.print("Employee NOT found in record!!!");
                    break;
                case 4:
                    System.out.print("Enter ID of employee you want delete: ");
                    x = scm.nextInt();
                    for (int i = 0; i < c; i++) {
                        emp = e.get(i);
                        if (emp.id == x) {
                            e.remove(i);
                            flag++;
                            c--;
                            break;
                        }
                    }
                    if (flag == 0)
                        System.out.print("Employee NOT found in record!!!");
                    break;
                case 5:
                    System.out.print("Enter IDs of the employees you want to compare: ");
                    x = scm.nextInt();
                    y = scm.nextInt();
                    for (int i = 0; i < c; i++) {
                        emp = e.get(i);
                        if (emp.id == x)
                            break;
                    }
                    for (int i = 0; i < c; i++) {
                        emp2 = e.get(i);
                        if (emp2.id == y)
                            break;
                    }
                    if (emp.sal > emp2.sal)
                        System.out.print("Employee: " + emp.id + " has more salary than Employee: " + emp2.id);
                    else if (emp.sal < emp2.sal)
                        System.out.print("Employee: " + emp2.id + " has more salary than Employee: " + emp.id);
                    else
                        System.out
                                .print("Employee: " + emp2.id + " and Employee: " + emp.id + " have the same salary.");
                    break;
                case 6:
                    for (int i = 0; i < c - 1; i++) {
                        emp = e.get(i);
                        for (int j = i + 1; j < c; j++) {
                            emp2 = e.get(j);
                            if (emp.name.compareTo(emp2.name) > 0) {
                                t = emp;
                                emp = emp2;
                                emp2 = t;
                            }
                        }
                    }
                    System.out.print("Employee record is sorted");
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
            }
            System.out.print("\nDo you want to continue?(y/n): ");
            ans = scm.next().charAt(0);
        }
    }
}
