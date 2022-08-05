package Lection_15.Lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        Operation<Integer> operation1 = (List<Integer> list) -> {
            Integer sum = 0;
            for (Integer l : list) {
                sum += l;
            }
            return sum;
        };
        Operation<Double> operation2 = (List<Double> list) -> {
            Double average = 0.0;
            Double sum1 = 0.0;
            for (Double l : list) {
                sum1 += l;
                average = sum1 / list.size();
            }
            return average;
        };
        Operation<String> operation3 = (List<String> list) -> {
            String str = "";
            for (String l : list) {
                str = str.concat(l);
            }
            return str;
        };

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        System.out.println(operation1.doSomething(list1));

        List<Double> list2 = new ArrayList<>();
        list2.add(2.5);
        list2.add(6.5);
        System.out.println(operation2.doSomething(list2));

        List<String> list3 = new ArrayList<>();
        list3.add("Hello ");
        list3.add("World");
        System.out.println(operation3.doSomething(list3));
    }
}

interface Operation<T> {
    T doSomething(List<T> list);
}
