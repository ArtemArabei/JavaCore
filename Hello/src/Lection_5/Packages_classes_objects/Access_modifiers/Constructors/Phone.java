package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

public class Phone {
    public int number;
    public String model;
    public float weight;

    public Phone() {
        this(291111111, "Nokia 3310", 200.1F);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }


    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public int getNumber(int number) {
        return number;
    }

    public void sendMessage(int ... v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
