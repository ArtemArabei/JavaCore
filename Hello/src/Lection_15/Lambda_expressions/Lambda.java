package Lection_15.Lambda_expressions;

public class Lambda {
    public static void main(String[] args) {
        Runnable test = () -> System.out.println("Hello world!");
        new Thread(test).start();
    }
}

