package Lection_17.Java_Design_Patterns.Examples.AbstractFactory;

public class BigTennisEquipment extends TennisEquipment {
    public BigTennisEquipment(TennisEquipmentFactory tennisEquipmentFactory) {
        name = "������������ ��� �������� �������";
        equipment.add(tennisEquipmentFactory.createTennisBall());
        equipment.add(tennisEquipmentFactory.createTennisRacket());
        equipment.add(tennisEquipmentFactory.createTennisNet());
    }
}
