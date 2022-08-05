package by.academy.smarthouse;

public class ClimateControl implements IClimateControl{

    public int startHeating(int temperature, int min) {
        int temp = temperature + min;
        Heating heating = new Heating();
        heating.showAction(temp);
        return temp;
    }

    class Heating {
        void showAction(int temp) {
            System.out.println("����������� ��������� ����� ���������� " +
                    "�����, ������ ����������� ����� " + temp);
        }
    }

    public int startCooling(int temperature, int min) {
        int temp = temperature - min;
        Cooling cooling = new Cooling();
        cooling.showAction(temp);
        return temp;
    }

    static class Cooling {
        static void showAction(int temp) {
            System.out.println("����������� ���������� ����� ���������� " +
                    "����������� �����, ������ ����������� ����� " + temp);
        }
    }
}