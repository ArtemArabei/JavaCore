import by.academy.smarthouse.Clock;
import by.academy.smarthouse.House;

import java.util.Random;

public class HouseManager {

    public static void main(String[] args) {
        House house = new House();
        House[] houseArray = new House[50];
        for (int i = 0; i < houseArray.length; i++) {
            int newNumber;
            do {
                newNumber = new Random().nextInt(50) + 1;
            } while (!isUnique(houseArray, newNumber));
            houseArray[i] = new House();
            houseArray[i].houseNumber = newNumber;
        }
        for (int i = 0; i < houseArray.length - 1; i++) {
            for (int j = i + 1; j < houseArray.length; j++) {
                if (houseArray[i].houseNumber > houseArray[j].houseNumber) {
                    int buf = houseArray[i].houseNumber;
                    houseArray[i].houseNumber = houseArray[j].houseNumber;
                    houseArray[j].houseNumber = buf;
                }
            }
        }
        for (int i = 0;
             i < houseArray.length; i++) {
            System.out.println(("Номер дома " + houseArray[i].houseNumber));
        }

        house.createDesiredTemp(25);
        house.createDesiredHumidity(70.0f);

        House house1 = new House();
        House.quantity++;
        House house2 = new House();
        House.quantity++;
        System.out.println(House.getHouseInfo());
    }

    private static boolean isUnique(House[] houseArray, int newNumber) {
        for (int i = 0; i < houseArray.length - 1; i++) {
            if (houseArray[i] == null) {
                continue;
            }
            if (houseArray[i].houseNumber == newNumber) {
                return false;
            }
        }
        return true;
    }
}
