package Lection_17.Java_Design_Patterns.Examples;

public class TestDirector {
    public static void main(String[] args) {
        Director d1 = Director.getInstance("������������ ��������");
        Director d2 = Director.getInstance("������ �����");
        d1.sign();
        d2.sign();
    }
}
