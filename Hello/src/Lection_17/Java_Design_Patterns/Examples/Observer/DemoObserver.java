package Lection_17.Java_Design_Patterns.Examples.Observer;

public class DemoObserver {

    public static void main(String[] args) {
        HouseParameters parameters = new HouseParameters();
        HouseMonitor monitor = new HouseMonitor(parameters);
        parameters.changeData(20, 55);
        parameters.changeData(25, 40);
        parameters.changeData(23, 45);
        parameters.removeObserver(monitor);
        HouseMonitor mobileApp = new HouseMonitor(parameters);
        parameters.changeData(27, 50);
        parameters.changeData(22, 40);
        parameters.changeData(25, 60);
        parameters.removeObserver(mobileApp);
    }
}

