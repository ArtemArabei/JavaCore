package Lection_17.Java_Design_Patterns.Examples.Observer;

import java.util.ArrayList;
import java.util.List;

public class HouseParameters implements Notifier {
    private List observers;
    private int temperature;
    private int humidity;

    public HouseParameters() {
        observers = new ArrayList();
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Подключено новое устройство");
    }

    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0) {
            observers.remove(i);
            System.out.println("Удалено ранее подключенное устройство");
        }
    }

    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer obs = (Observer) observers.get(i);
            obs.update(temperature, humidity);
        }
    }

    public void changeData(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObserver();
    }
}

