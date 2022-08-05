package by.academy.smarthouse;

public class HumidityControl {

    float startHumidification(float percent, float min) {
        float moisture = percent + min;
        System.out.println("«апустилось увлажнение воздуха, теперь влажность = " + moisture + "%");
        return moisture;
    }

    float startDeHumidification(float percent, float min){
        float moisture = percent - min;
        System.out.println("«апустилось осушение воздуха, теперь влажность = " + moisture + "%");
        return moisture;
    }
}