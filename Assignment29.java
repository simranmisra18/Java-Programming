package JP;

//Remove duplicate elements
import java.util.*;

class Assignment29 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(20, 20, 30, 40, 50, 50, 50));
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (list.get(i) == list.get(j)) {
                    list.remove(i);
                }
            }

        }
        System.out.println("Array list is: " + list + "\nSize=" + list.size());
    }
}
