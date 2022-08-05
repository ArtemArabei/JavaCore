package by.academy.smarthouse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class House extends Building implements ILightning, ISecuritySystem {
    public int temperature;
    public int humidity;
    private IClimateControl climateControl;
    private IHumidityControl humidityControl;
    private String city;
    private String street;
    private int houseNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public House() {
        this((int) (Math.random() * 100), (int) (Math.random() * 100));
    }

    public House(int temperature, int humidity) {
        this.temperature = temperature;
        this.climateControl = new ClimateControl();
        this.humidity = humidity;
        this.humidityControl = new HumidityControl();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void createDesiredTemp(int desiredTemp) {
        if (desiredTemp < temperature) {
            climateControl.startCooling(temperature, temperature
                    - desiredTemp);
        } else if (desiredTemp > temperature) {
            climateControl.startHeating(temperature, desiredTemp
                    - temperature);
        } else System.out.println("Температура в норме");
    }

    public void createDesiredHumidity(int desiredHumidity) {
        if (desiredHumidity < humidity) {
            humidityControl.startDrying(humidity, humidity
                    - desiredHumidity);
        } else if (desiredHumidity > humidity) {
            humidityControl.startHydration(humidity, desiredHumidity
                    - humidity);
        } else System.out.println("Влажность в норме");
    }

    public String setAddress(String address) {

        System.out.println("Первоначально адрес выглядит так: " + address);
        /*выводим строку для удобства проверки результата*/
        address = address.replaceAll("[^a-zA-Z_0-9а-яА-Я.,\\- ]", "");
        address = address.replaceAll(" +", " ");
        address = address.trim();
        System.out.println("После форматирования адрес выглядит так: "
                + address);
        /*выводим строку для удобства проверки результата*/
        Pattern p = Pattern.compile("[a-zA-Zа-яА-Я ]+ обл. [a-zA-Zа-яА-Я ]+" +
                " р-н [a-zA-Zа-яА-Я ]+ (г|д).+ [a-zA-Zа-яА-Я ]+ ул. " +
                "[a-zA-Zа-яА-Я ]+ д. [0-9 ]");
        Matcher matcher = p.matcher(address);
        if (matcher.find() == false) {
            address = "Введенный адрес не соответствует формату, введите " +
                    "правильный адрес";
        }
        System.out.println("После валидации адреса получаем такой результат:");
        this.adress = adress;
        return address;
    }

    @Override
    public void runAutoLightning(double workTime) {
        System.out.println("Освещение включено");
    }

    @Override
    public void stopAutoLightning() {
        System.out.println("Освещение выключено");
    }

    @Override
    public void callPolice() {
        System.out.println("Звоните 911!");
    }

    @Override
    public void runFireAlarm() {
        System.out.println("Спасайся кто может - горим, пожар!!!");
    }

    public void runFireAlarm(String text) {
        System.out.println(text);
    }

}