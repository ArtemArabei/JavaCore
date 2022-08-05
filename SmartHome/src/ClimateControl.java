package by.academy.smarthouse;

public class ClimateControl {

    int startHeating(int temperature, int min){
        int temp = temperature + min;
        System.out.println("Запустилось отопление, теперь температура = " + temp);
        return temp;
    }

    int startCooling(int temperature, int min){
        int temp = temperature - min;
        System.out.println("Запустилось охлаждение, теперь температура = " + temp);
        return temp;
    }
}