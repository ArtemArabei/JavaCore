import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ListCollection {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 21));
        }
        System.out.println(numbers);

        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            while (((int) iterator.next()) % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
        System.out.println();
        TreeSet<Integer> treeSet = new TreeSet<>(numbers);
        System.out.println("TreeSet: " + treeSet);
    }
}

/*


        Iterator iterator = arraylist.iterator();
        while (iterator.hasNext()) {
            while (((int) iterator.next()) % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println();
        TreeSet<Integer> treeSet = new TreeSet<>(arraylist);
        System.out.println("TreeSet: " + treeSet);
    }
}*/
