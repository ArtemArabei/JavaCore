package by.academy.smarthouse;

public class Clock {

    private int alarmHours;
    private int alarmMinutes;

    public String setAlarm(int hours, int minutes) {
        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
            alarmHours = hours;
            alarmMinutes = minutes;
            System.out.println("Будильник заведен на "
                    + String.format("%02d", alarmHours) + ":"
                    + String.format("%02d", alarmMinutes));
            return "Будильник заведен";
        } else
            System.out.println("Время задано неверно");
        return "Время задано неверно";
    }

    public String checkAlarm(int hours, int minutes) {
        if (hours == alarmHours && minutes == alarmMinutes) {
            System.out.println("Будильник звонит");
            return "Chime";
        } else
            System.out.println("Будильник не звонит");
        return null;
    }

    public int checkTimeCount(int hours, int minutes){
        if (minutes == 00){
            if (hours <= 12) {
                System.out.println(
                        "В " + String.format("%02d", hours) + ":"
                                + String.format("%02d", minutes)
                                + " часы пробьют " + hours + " раз");
                return hours;
            } else System.out.println(
                    "В " + String.format("%02d", hours) + ":"
                            + String.format("%02d", minutes)
                            + " часы пробьют " + (hours - 12) + " раз");
            return (hours - 12);
        } else if (minutes == 15 || minutes == 30 || minutes == 45){
            System.out.println(
                    "В " + String.format("%02d", hours) + ":"
                            + String.format("%02d", minutes)
                            + " часы пробьют " + 1 + " раз");
            return 1;
        }else System.out.println(
                "В " + String.format("%02d", hours) + ":"
                        + String.format("%02d", minutes)
                        + " часы пробьют " + 0 + " раз");
        return 0;
    }
}