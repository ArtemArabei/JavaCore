package Lection_17.Java_Design_Patterns.Examples.AbstractFactory;

public class TableTennisEquipment extends TennisEquipment {
    public TableTennisEquipment(TennisEquipmentFactory tennisEquipmentFactory){
        name = "������������ ��� ����������� �������";
        equipment.add(tennisEquipmentFactory.createTennisBall());
        equipment.add(tennisEquipmentFactory.createTennisRacket());
        equipment.add(tennisEquipmentFactory.createTennisNet());
    }
}
