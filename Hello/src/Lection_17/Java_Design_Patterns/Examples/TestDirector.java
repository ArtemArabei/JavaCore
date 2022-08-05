package Lection_17.Java_Design_Patterns.Examples;

public class TestDirector {
    public static void main(String[] args) {
        Director d1 = Director.getInstance("Неповторимый оригинал");
        Director d2 = Director.getInstance("Жалкая копия");
        d1.sign();
        d2.sign();
    }
}
