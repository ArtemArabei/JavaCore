package Lection_3.Operators.Control_Operators;

public class Clock {
        public int alarmHours, alarmMinutes;

    public String setAlarm(int hours, int minutes) {
        String resultOfSetAlarm;
        if (hours < 24 && minutes < 60) {
            resultOfSetAlarm = "- Будильник установлен на " + hours + " ч. "
                    + minutes + " мин.";
            alarmHours = hours;
            alarmMinutes = minutes;
        } else
            resultOfSetAlarm = "- Будильник не может быть установлен на жела" +
                    "емое время, проверьте правильность введенных данных";
               return resultOfSetAlarm;
    }

    public String checkAlarm(int hours, int minutes) {
        String resultOfCheckAlarm;
        if (hours == alarmHours && minutes == alarmMinutes) {
            resultOfCheckAlarm = "- Время, на которое был установлен " +
                    "будильник, наступило. - Chime";
        } else resultOfCheckAlarm = "- Время, на которое был установлен " +
                "будильник, еще не наступило. - Будильник не сработал.";
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
