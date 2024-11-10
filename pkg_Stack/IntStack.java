package JP.pkg_Stack;

import java.util.*;
import java.io.*;

public class IntStack {
    public int max = 50;
    public int[] data = new int[max];
    public ArrayList<Integer> list = new ArrayList<Integer>();
    public int top1 = -1, top2 = -1;

    public void push1(int n) {
        if (top1 == max - 1) {
            System.out.println("Stack overflow.");
        } else {
            top1++;
            data[top1] = n;
        }
    }

    public void pop1() {
        if (top1 == -1) {
            System.out.println("Stack underflow.");
        } else {
            System.out.print(data[top1] + " ");
            top1--;
        }
    }

    public void push2(int n) {
        top2++;
        list.add(n);
    }

    public void pop2() {
        if (top2 == -1) {
            System.out.println("Stack underflow.");
        } else {
            System.out.print(list.get(top2) + " ");
            list.remove(top2);
            top2--;
        }
    }
}
