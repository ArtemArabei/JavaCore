package by.academy.smarthouse;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class House {

    public int localCounter;
    public static int counter;
    public final static int POD = 5;
    public final static int FLOOR = 5;
    public static int quantity;

    public int houseNumber = (int) (Math.random() * 100);
    public int temperature = (int) (Math.random() * 100);
    public float humidity = (float) (Math.random() * 100);
    public BigDecimal humidityBD = new BigDecimal(humidity);
    private ClimateControl climateControl = new ClimateControl();
    private MoistureControl moistureControl = new MoistureControl();

    public static String getHouseInfo() {
        return ("Во всех домах данного типа " + FLOOR +
                " этажей " + POD + " подъездов. На данный момент построено "
                + quantity + " домов.");
    }

    public void createDesiredTemp(int desiredTemp) {

        System.out.println("Первоначальная температура = " + temperature);

        if (temperature > desiredTemp) {
            climateControl.startCooling(temperature, temperature - desiredTemp);
        } else if (temperature < desiredTemp) {
            climateControl.startHeating(temperature, desiredTemp - temperature);
        } else System.out.println("Температура в норме");
    }

    public void createDesiredHumidity(float desiredHumidity) {

        System.out.println("Первоначальная влажность = "
                + humidityBD.setScale(1, RoundingMode.HALF_UP) + "%");
        if (humidity < desiredHumidity) {
            moistureControl.startHumidification(humidity,
                    desiredHumidity - humidity);
        } else if (humidity > desiredHumidity) {
            moistureControl.startDeHumidification(humidity,
                    humidity - desiredHumidity);
        } else System.out.println("Влажность в норме");

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}

