package Lection_17.Java_Design_Patterns.Pattern.singleton;

public final class SingletonErr {
    private static SingletonErr instance;
    public String value;

    private SingletonErr(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonErr getInstance(String value) {
        if (instance == null) {
            instance = new SingletonErr(value);
        }
        return instance;
    }
}