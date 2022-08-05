package Lection_17.Java_Design_Patterns.Examples;

import Lection_17.Java_Design_Patterns.Examples.Logger;

import java.io.File;

public class TestLogger {
    public static void main(String[] args) {
        File file = new File("c:/test/TestLogger.txt");
        File file2 = new File("c:/test/TestLogger2.txt");
        File file3 = new File("c:/test/TestLogger3.txt");
        File file4 = new File("c:/test/TestLogger4.txt");
        Logger log1 = Logger.getInstance(file);
        Logger log2 = Logger.getInstance(file2);
        Logger log3 = Logger.getInstance(file3);
        Logger log4 = Logger.getInstance(file4);
        log1.logError("Наташ, ты спишь?");
        log2.logError("Уже 6 часов утра, Наташ!");
        log3.logError("Вставай, мы там все уронили!");
        log4.logError("Мы уронили вообще все, Наташ, честно!");
    }
}