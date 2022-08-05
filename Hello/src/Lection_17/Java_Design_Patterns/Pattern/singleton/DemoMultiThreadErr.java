package Lection_17.Java_Design_Patterns.Pattern.singleton;

public class DemoMultiThreadErr {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFooErr());
        Thread threadBar = new Thread(new ThreadBarErr());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFooErr implements Runnable {
        @Override
        public void run() {
            SingletonErr singleton = SingletonErr.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBarErr implements Runnable {
        @Override
        public void run() {
            SingletonErr singleton = SingletonErr.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}