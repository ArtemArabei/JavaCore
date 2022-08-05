package by.academy.smarthouse;

public class HumidityControl implements IHumidityControl {

    public int startHydration(int humidity, int min) {
        int hum = humidity + min;
        class Hydration {
            void showAction() {
                System.out.println("Запустилось увлажнение через локальный " +
                        "класс, теперь влажность равна " + hum);
            }
        }
        Hydration hydration = new Hydration();
        hydration.showAction();
        return hum;
    }

    public int startDrying(int humidity, int min) {
        int hum = humidity - min;
        IHumidityControl drying = new IHumidityControl() {
            @Override
            public int startHydration(int humidity, int min) {
                return 0;
            }

            @Override
            public int startDrying(int humidity, int min) {
                System.out.println("Запустилось осушение через анонимный " +
                        "класс, теперь влажность равна " + hum);
                return 0;
            }
        };
        drying.startDrying(humidity, min);
        return hum;
    }
}
