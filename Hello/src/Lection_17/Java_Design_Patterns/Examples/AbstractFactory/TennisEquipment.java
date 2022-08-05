package Lection_17.Java_Design_Patterns.Examples.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

abstract class TennisEquipment {
    String name;
    List equipment = new ArrayList();

    public String toString(){
        return name + ":\n" + equipment;
    }
}
