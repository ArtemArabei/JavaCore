package Lection_17.Java_Design_Patterns.Examples.Observer;

public class HouseMonitor implements Observer {
    private Notifier notifier;
    private int temperature;
    private int humidity;

    public HouseMonitor(Notifier notifier) {
        this.notifier = notifier;
        notifier.addObserver(this);
    }

    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        show();
    }

    public void show() {
        System.out.println("Температура в доме составляет " + temperature
                + " градусов, влажность равна " + humidity + " процентам");
    }
}

