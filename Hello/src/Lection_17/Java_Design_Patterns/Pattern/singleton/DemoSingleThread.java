package Lection_17.Java_Design_Patterns.Pattern.singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        SingletonSimple singleton = SingletonSimple.getInstance("FOO");
        SingletonSimple anotherSingleton = SingletonSimple.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}