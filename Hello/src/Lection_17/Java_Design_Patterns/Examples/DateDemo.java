package Lection_17.Java_Design_Patterns.Examples;

public final class DateDemo {
    private static volatile DateDemo instance;

    public String date;

    private DateDemo(String date) {
        this.date = date;
    }

    public static DateDemo getInstance(String date) {
        DateDemo result = instance;
        if (result != null) {
            return result;
        }
        synchronized (DateDemo.class) {
            if (instance == null) {
                instance = new DateDemo(date);
            }
            return instance;
        }
    }

    public void printDate() {
        System.out.println(date);
    }
}