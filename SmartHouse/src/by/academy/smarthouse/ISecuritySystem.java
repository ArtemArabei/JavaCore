package by.academy.smarthouse;

public interface ISecuritySystem {

    String version = "1.0.0";

    void callPolice();

    default void runFireAlarm() {
        System.out.println("Спасайся кто может - горим!");
    }
}
