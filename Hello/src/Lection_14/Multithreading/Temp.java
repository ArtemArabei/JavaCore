package Lection_14.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Temp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> ft = new FutureTask<>(() -> {
            int i = 0;
            for (; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "smth" + i);
            }
            return i;
        });
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "«начение переменной цикла i" + i);
            if (i == 2) {
                new Thread(ft, "Ќить с возвращаемым значением").start();
            }
        }
        try {
            System.out.println("¬озвращаемое значение дочернего потока:" + ft.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


       /* Callable task = () -> {
            return "Hello, World!";
        };
        FutureTask<String> future = new FutureTask<>(task);
        new Thread(future).start();
        System.out.println(future.get());*/


        /*

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);



        Converter<String, Integer> converter2 = Integer::valueOf;
        Integer converted2 = converter2.convert("123");
        System.out.println(converted2);

        Predicate<Integer> negative = i -> i < 0;
        System.out.println(negative.test(-6));
        System.out.println(negative.test(6));
        System.out.println(negative.test(0));

       *//* public interface Predicate<T> {
            boolean test(T t);
        }*//*

        String t = "One";
        Supplier<String> supplierStr = () -> t.toUpperCase();
        System.out.println(supplierStr.get());

       *//* public interface Supplier<T> {
            T get();
        }*//*

        Function<Integer, String> convert = x-> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов

        *//*public interface Function<T, R> {
            R apply(T t);
        }*//*
*/
    }
}

interface Converter<F, T> {
    T convert (F from);
}
