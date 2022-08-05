package Lection_3.Operators.Control_Operators;

public class Exercise9 {

    public static class Date {
        public int day, month, year;
    }

    public static Date generateDate() {
        // чтобы не загромождать код, ограничимся генерацией даты в пределах
        // 20-21 века (1900 - 2099 годы)
        int year = (int) (Math.random() * 200) + 1900;
        int month = (int) (Math.random() * 12) + 1;
        int day = 1;
        if (year % 4 == 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = (int) (Math.random() * 31) + 1;
                    break;
                case 2:
                    day = (int) (Math.random() * 29) + 1;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = (int) (Math.random() * 30) + 1;
                    break;
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = (int) (Math.random() * 31) + 1;
                    break;
                case 2:
                    day = (int) (Math.random() * 28) + 1;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = (int) (Math.random() * 30) + 1;
                    break;
            }
        }
        Date date = new Date();
        date.day = day;
        date.month = month;
        date.year = year;
        return date;
    }

    public static Date setNextDate(Date date) {
        Date nextDate = new Date();
        int newDay = 0;
        int newMonth = 0;
        int newYear = 0;
        int day = date.day;
        int month = date.month;
        int year = date.year;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == 31) {
                    if (month != 12) {
                        newDay = 1;
                        newMonth = month + 1;
                        newYear = year;
                    } else {
                        newDay = 1;
                        newMonth = 1;
                        newYear = year + 1;
                    }
                } else {
                    newDay = day + 1;
                    newMonth = month;
                    newYear = year;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    newDay = 1;
                    newMonth = month + 1;
                    newYear = year;
                } else {
                    newDay = day + 1;
                    newMonth = month;
                    newYear = year;
                }
                break;
            case 2:
                if (year % 4 == 0) {
                    if (day == 29) {
                        newDay = 1;
                        newMonth = month + 1;
                        newYear = year;
                    } else {
                        newDay = day + 1;
                        newMonth = month;
                        newYear = year;
                    }
                } else {
                    if (day == 28) {
                        newDay = 1;
                        newMonth = month + 1;
                        newYear = year;
                    } else {
                        newDay = day + 1;
                        newMonth = month;
                        newYear = year;
                    }
                    break;
                }

        }
        nextDate.day = newDay;
        nextDate.month = newMonth;
        nextDate.year = newYear;
        return nextDate;
    }

    public static void main(String[] args) {
        Date date = generateDate();
        System.out.println("Исходная дата - " + date.day + "." + date.month
                + "." + date.year);
        Date nextDate = setNextDate(date);
        System.out.println("Дата следующего дня - " + nextDate.day + "."
                + nextDate.month + "." + nextDate.year);
    }
}
