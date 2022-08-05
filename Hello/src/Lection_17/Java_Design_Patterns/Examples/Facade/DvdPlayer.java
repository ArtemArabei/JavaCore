package Lection_17.Java_Design_Patterns.Examples.Facade;

public class DvdPlayer {
    public void powerOn() {
        System.out.println("ДВД-проигрыватель включен");
    }

    public void connectToTv() {
        System.out.println("ДВД-проигрыватель подключен к ТВ");
    }

    public void startMovie() {
        System.out.println("Просмотр начат");
    }

    public void endMovie() {
        System.out.println("Просмотр окончен");
    }

    public void powerOff() {
        System.out.println("ДВД-проигрыватель выключен");
    }
}
