package Lection_15.Lambda_expressions;

public class Lambda2 {
    public static void main(String[] args) {
        MathInterface<Integer> find = (x, y) -> {
            if (x > y)
                return x;
            else return y;
        };
        System.out.println(find.getMax(30, 20));

        //Mathinterface<Integer> operation = (first, next) ->  first > next ? first : next;

    }
}

interface MathInterface<T> {
    T getMax(T first, T second);
}