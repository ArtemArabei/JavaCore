package Lection_17.Java_Design_Patterns.Pattern.singleton;

public final class SingletonSimple {
    private static SingletonSimple instance;
    public String value;

    private SingletonSimple(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonSimple getInstance(String value) {
        if (instance == null) {
            instance = new SingletonSimple(value);
        }
        return instance;
    }
}