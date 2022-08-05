package Lection_17.Java_Design_Patterns.Examples;

public final class Director {
    /*Создать класс Director с методом sign.
Реализовать паттерн Singelton для получения директора в единственном числе.
Протестировать*/
    private static volatile Director instance;
    public String sign;
    private Director(String sign) {
        this.sign = sign;
    }
    public void sign(){
        System.out.println(sign);
    }
    public static Director getInstance(String sign) {
        Director result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Director.class) {
            if (instance == null) {
                instance = new Director(sign);
            }
            return instance;
        }
    }
}