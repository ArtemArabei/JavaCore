package Lection_3.Operators.Control_Operators;

public class Clock {
        public int alarmHours, alarmMinutes;

    public String setAlarm(int hours, int minutes) {
        String resultOfSetAlarm;
        if (hours < 24 && minutes < 60) {
            resultOfSetAlarm = "- ��������� ���������� �� " + hours + " �. "
                    + minutes + " ���.";
            alarmHours = hours;
            alarmMinutes = minutes;
        } else
            resultOfSetAlarm = "- ��������� �� ����� ���� ���������� �� ����" +
                    "���� �����, ��������� ������������ ��������� ������";
               return resultOfSetAlarm;
    }

    public String checkAlarm(int hours, int minutes) {
        String resultOfCheckAlarm;
        if (hours == alarmHours && minutes == alarmMinutes) {
            resultOfCheckAlarm = "- �����, �� ������� ��� ���������� " +
                    "���������, ���������. - Chime";
        } else resultOfCheckAlarm = "- �����, �� ������� ��� ���������� " +
                "���������, ��� �� ���������. - ��������� �� ��������.";
        return resultOfCheckAlarm;
    }

    public int checkTimeCount(int hours, int minutes) {
        int timeCount;
        if (minutes == 0) {
            timeCount = hours;
        } else {
            if ((minutes % 15) == 0) {
                timeCount = 1;
            } else timeCount = 0;
        }
        return timeCount;
    }
}
