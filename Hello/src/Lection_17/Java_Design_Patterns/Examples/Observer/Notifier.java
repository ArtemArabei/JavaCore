package Lection_17.Java_Design_Patterns.Examples.Observer;

public interface Notifier {
    public void addObserver(Observer obs);

    public void removeObserver(Observer obs);

    public void notifyObserver();
}
