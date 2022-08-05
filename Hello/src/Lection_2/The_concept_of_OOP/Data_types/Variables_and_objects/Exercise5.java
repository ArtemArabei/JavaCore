package Lection_2.The_concept_of_OOP.Data_types.Variables_and_objects;

public class Exercise5 {
    public static void main(String[] args) {
        int sec = 708871;
        int s = sec % 60;
        int min = (sec - s) / 60;
        int m = min % 60;
        int hour = (min - m) / 60;
        int h = hour % 24;
        int day = (hour - h) / 24;
        int d = day % 7;
        int w = (day - d) / 7;
        System.out.println(h + " hours, " + m + " minutes, " + s + " seconds, " + d + " days, " + w + " weeks");
    }
}