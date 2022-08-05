package by.academy.smarthouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdressBook {

    private static List<House> houses;

    AdressBook(List<House> houses) {
        this.houses = houses;
    }

    public List<House> getHousesByCity(String city) {
        List<House> housesByCity = new ArrayList<>();
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i).getCity() == city) {
                housesByCity.add(houses.get(i));
            }
        }
        return housesByCity;
    }


    public List<House> getHouseByAddress(String city, String street,
                                         int houseNumber) {
        List<House> houseByAddress = new ArrayList<>();
        for (int i = 0; i < houses.size(); i++) {
            if (((houses.get(i).getCity() == city) &&
                    (houses.get(i).getStreet() == street))
                    && (houses.get(i).getHouseNumber() == houseNumber)) {
                houseByAddress.add(houses.get(i));
            }
        }
        return houseByAddress;
    }

    public List<House> getAllHouses() {
        Collections.sort(houses, Comparator.comparing(House::getCity).
                thenComparing(House::getStreet).
                thenComparing(House::getHouseNumber));
        return houses;
    }

    public static void main(String[] args) throws NotValidTemperatureException, NotValidHumidityException {
        List<House> newHouses = new ArrayList<>();
        House house1 = new House();
        house1.setCity("Minsk");
        house1.setStreet("Peace");
        house1.setHouseNumber(7);
        newHouses.add(house1);
        House house2 = new House();
        house2.setCity("Minsk");
        house2.setStreet("Freedom");
        house2.setHouseNumber(7);
        newHouses.add(house2);
        House house3 = new House();
        house3.setCity("Gomel");
        house3.setStreet("Freedom");
        house3.setHouseNumber(9);
        newHouses.add(house3);
        House house4 = new House();
        house4.setCity("Grodno");
        house4.setStreet("Happy");
        house4.setHouseNumber(11);
        newHouses.add(house4);
        House house5 = new House();
        house5.setCity("Minsk");
        house5.setStreet("Peace");
        house5.setHouseNumber(6);
        newHouses.add(house5);

        AdressBook myBook = new AdressBook(newHouses);
        for (int i = 0; i < houses.size(); i++) {
            System.out.println("Город " + houses.get(i).getCity()
                    + ",\tулица " + houses.get(i).getStreet()
                    + ",\tдом " + houses.get(i).getHouseNumber());
        }
        System.out.println();
        List<House> housesByCity = myBook.getHousesByCity("Minsk");
        for (int i = 0; i < housesByCity.size(); i++) {
            System.out.println("Город " + housesByCity.get(i).getCity()
                    + ",\tулица " + housesByCity.get(i).getStreet()
                    + ",\tдом " + housesByCity.get(i).getHouseNumber());
        }
        System.out.println();
        List<House> houseByAddress = myBook.getHouseByAddress
                ("Minsk", "Peace", 6);
        System.out.println("Город " + houseByAddress.get(0).getCity()
                + ",\tулица " + houseByAddress.get(0).getStreet()
                + ",\tдом " + houseByAddress.get(0).getHouseNumber());

        myBook.getAllHouses();
        System.out.println();
        for (int i = 0; i < houses.size(); i++) {
            System.out.println("Город " + houses.get(i).getCity()
                    + ",\tулица " + houses.get(i).getStreet() + ",\tдом "
                    + houses.get(i).getHouseNumber());
        }
    }
}
