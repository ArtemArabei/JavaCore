package by.academy.smarthouse;

public class HumidityControl {

    float startHumidification(float percent, float min) {
        float moisture = percent + min;
        System.out.println("����������� ���������� �������, ������ ��������� = " + moisture + "%");
        return moisture;
    }

    float startDeHumidification(float percent, float min){
        float moisture = percent - min;
        System.out.println("����������� �������� �������, ������ ��������� = " + moisture + "%");
        return moisture;
    }
}