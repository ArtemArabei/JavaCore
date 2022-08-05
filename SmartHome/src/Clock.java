package by.academy.smarthouse;

public class Clock {

    private int alarmHours;
    private int alarmMinutes;

    public String setAlarm(int hours, int minutes) {
        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
            alarmHours = hours;
            alarmMinutes = minutes;
            System.out.println("��������� ������� �� "
                    + String.format("%02d", alarmHours) + ":"
                    + String.format("%02d", alarmMinutes));
            return "��������� �������";
        } else
            System.out.println("����� ������ �������");
        return "����� ������ �������";
    }

    public String checkAlarm(int hours, int minutes) {
        if (hours == alarmHours && minutes == alarmMinutes) {
            System.out.println("��������� ������");
            return "Chime";
        } else
            System.out.println("��������� �� ������");
        return null;
    }

    public int checkTimeCount(int hours, int minutes){
        if (minutes == 00){
            if (hours <= 12) {
                System.out.println(
                        "� " + String.format("%02d", hours) + ":"
                                + String.format("%02d", minutes)
                                + " ���� ������� " + hours + " ���");
                return hours;
            } else System.out.println(
                    "� " + String.format("%02d", hours) + ":"
                            + String.format("%02d", minutes)
                            + " ���� ������� " + (hours - 12) + " ���");
            return (hours - 12);
        } else if (minutes == 15 || minutes == 30 || minutes == 45){
            System.out.println(
                    "� " + String.format("%02d", hours) + ":"
                            + String.format("%02d", minutes)
                            + " ���� ������� " + 1 + " ���");
            return 1;
        }else System.out.println(
                "� " + String.format("%02d", hours) + ":"
                        + String.format("%02d", minutes)
                        + " ���� ������� " + 0 + " ���");
        return 0;
    }
}