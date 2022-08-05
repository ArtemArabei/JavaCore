package Lection_3.Operators.Control_Operators;

public class Exercise11 {

    public static int generateDay() {
        int day = (int) (Math.random() * 7) + 1;
        return day;
    }

    public static String getSchedule(int day) {
        String schedule= "";
        switch (day) {
            case 1:
                schedule = "Сегодня понедельник: курсов в 18.00 не будет в " +
                        "связи с праздничными днями";
                break;
            case 2:
                schedule = "Сегодня вторник: в 22.00 футбол - полуфинал Лиги" +
                        " Чемпионов!";
                break;
            case 3:
                schedule = "Сегодня среда: в 22.00 суперматч - Реал - " +
                        "Манчестер Сити - полуфинал Лиги Чемпионов!!!";
                break;
            case 4:
                schedule = "Сегодня четверг: не забудьте про курсы в 18.00!";
                break;
            case 5:
                schedule = "Сегодня пятница: можно ехать к родителям за город";
                break;
            case 6:
                schedule = "Сегодня суббота: время делать ДЗ к курсам";
                break;
            case 7:
                schedule = "Сегодня воскресенье: пора возвращаться в город";
                break;
        }
        return schedule;
    }

    public static void main(String[] args) {
        int day = generateDay();
        System.out.println("Порядковый номер дня недели - " + day);
        String schedule = getSchedule(day);
        System.out.print("Расписание: \n" + schedule);
    }
}
