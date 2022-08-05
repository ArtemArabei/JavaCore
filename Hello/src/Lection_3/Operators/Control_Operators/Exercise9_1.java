package Lection_3.Operators.Control_Operators;

public class Exercise9_1 {
    public static void main(String[] args) {
        // чтобы не загромождать код, ограничимся генерацией даты в пределах
        // 20-21 века (1900 - 2099 годы)
        int year = (int) (Math.random() * 200) + 1900;
        int newYear = 0;
        int month = (int) (Math.random() * 12) + 1;
        int newMonth = 0;
        int day = 1;
        int newDay = 0;
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
        System.out.println("Исходная дата - " + day + "." + month + "."
                + year);

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
        System.out.println("Дата следующего дня - " + newDay + "." + newMonth
                + "." + newYear);
    }
}
