package Lection_3.Operators.Control_Operators;

public class Alarm {
    public static void main(String[] args) {
        Clock clock = new Clock();
        int hours = 14;
        int minutes = 00;
        String result;
        result = clock.setAlarm(hours, minutes);
        System.out.println(result);
        result = clock.checkAlarm(14, 00);
        System.out.println(result);
        int timeCount = clock.checkTimeCount( hours, minutes);
        System.out.println("- Если будильник сейчас должен сработать, то " +
                "количество повторов равно " + timeCount + ".");
    }
}
