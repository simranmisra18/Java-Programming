package JP;

import java.io.*;
import java.util.*;

class Assignment82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        try {
            if (s.equals("India") == false) {
                throw new NOMATCHEXCEP(s);
            } else {
                System.out.println("String matched!!");
            }
        } catch (NOMATCHEXCEP e) {
            System.out.println("No match exception: Word: " + e.message());
            System.out.println("Line number: " + Thread.currentThread().getStackTrace()[1].getLineNumber());
        }
    }
}

class NOMATCHEXCEP extends Exception {
    String str = " ";

    NOMATCHEXCEP(String s) {
        str = s;
    }

    String message() {
        return str;
    }
}
