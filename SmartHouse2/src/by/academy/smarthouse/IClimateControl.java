package by.academy.smarthouse;

public interface IClimateControl {
    int startHeating(int temperature, int min);
    int startCooling(int temperature, int min);
}
