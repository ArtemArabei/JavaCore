import by.academy.smarthouse.House;

public class HouseManager {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("�������������� ����������� = "
                + house.getTemperature());
        house.createDesiredTemp(25);
        System.out.println("�������������� ��������� = "
                + house.getHumidity());
        house.createDesiredHumidity(60);
        System.out.println();
        System.out.println(house.setAddress("����������     �������� ���. " +
                "������� �-� ������� �. ����� ��. ����� ��������� �. 98"));
        house.runAutoLightning(60);
        house.stopAutoLightning();
        house.callPolice();
        house.runFireAlarm();
        house.runFireAlarm("������ ���!!!");
    }
}