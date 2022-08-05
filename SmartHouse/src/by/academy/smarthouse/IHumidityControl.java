package by.academy.smarthouse;

public interface IHumidityControl {
    int startHydration(int humidity, int min);
    int startDrying(int humidity, int min);
}
