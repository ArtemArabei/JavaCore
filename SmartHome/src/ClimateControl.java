package by.academy.smarthouse;

public class ClimateControl {

    int startHeating(int temperature, int min){
        int temp = temperature + min;
        System.out.println("����������� ���������, ������ ����������� = " + temp);
        return temp;
    }

    int startCooling(int temperature, int min){
        int temp = temperature - min;
        System.out.println("����������� ����������, ������ ����������� = " + temp);
        return temp;
    }
}