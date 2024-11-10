package JP;

import java.io.*;
import java.util.*;

abstract class Employee {
    private String name, address;
    protected int basicSalary;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setName(String nm) {
        name = nm;
    }

    public void setBasicSalary(int sal) {
        basicSalary = sal;
    }

    public abstract int getMonthlySalary();

}

class NormalEmployee extends Employee {
    public int getMonthlySalary() {
        return (basicSalary / 12);
    }
}

class BonusEmployee extends Employee {
    int addBonus(int bonus) {
        basicSalary = basicSalary + (bonus * 12);
        return basicSalary;
    }
}

class Assignment62 {
    public static void main(String[] args) {
        NormalEmployee ne = new NormalEmployee();
        BonusEmployee be = new BonusEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        ne.setName(name);
        System.out.println("Enter address:");
        String address = sc.next();
        ne.setAddress(address);
        System.out.println("Enter salary:");
        int salary = sc.nextInt();
        ne.setBasicSalary(salary);
        System.out.println("Name: " + ne.getName());
        System.out.println("Address: " + ne.getAddress());
        System.out.println("Yearly Salary: " + ne.getBasicSalary());
        System.out.println("Monthly salary: " + ne.getMonthlySalary());
        System.out.println("Enter bonus:");
        int bonus = sc.nextInt();
        System.out.println("Yearly salary: " + be.addBonus(bonus));
    }
}
