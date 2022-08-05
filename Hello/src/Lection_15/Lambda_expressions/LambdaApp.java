package Lection_15.Lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaApp {
    public static void main(String[] args) {
        Expression<Integer> operation1 = (list) -> {
            int sum = 0;
            for (int i : list) {
                sum += i;
            }
            return sum;
        };
        Expression<String> operation2 = (list) -> {
            String result = "";
            for (String i : list) {
                result += i;
            }
            return result;
        };
        Expression<Double> operation3 = (list) -> {
            Double average;
            Double sum = 0d;
            for (Double i : list) {
                sum += i;
            }
            average = sum / list.size();
            return average;
        };

        List<Integer> list1 = new ArrayList<>();
        list1.add(0, 1);
        list1.add(1, 2);

        List<String> list2 = new ArrayList<>();
        list2.add(0, "Hello");
        list2.add(1, "world!");

        List<Double> list3 = new ArrayList<>();
        list3.add(0, 1d);
        list3.add(1, 2d);

        System.out.println(operation1.doSomething(list1));
        System.out.println(operation2.doSomething(list2));
        System.out.println(operation3.doSomething(list3));
    }
}

interface Expression<T> {
    T doSomething(List<T> list);
}
