package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class Engine {
    String company;
    int power;

    public Engine(String company, int power) {
        this.company = company;
        this.power = power;
    }

    public String toString() {
        return "Мотор: производитель " + company + ", мощность " + power + " л.с.";
    }
}
