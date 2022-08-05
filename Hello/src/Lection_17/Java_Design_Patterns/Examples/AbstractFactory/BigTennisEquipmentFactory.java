package Lection_17.Java_Design_Patterns.Examples.AbstractFactory;

public class BigTennisEquipmentFactory implements TennisEquipmentFactory{
    @Override
    public TennisBall createTennisBall() {
        return new BigTennisBall();
    }

    @Override
    public TennisRacket createTennisRacket() {
        return new BigTennisRacket();
    }

    @Override
    public TennisNet createTennisNet() {
        return new BigTennisNet();
    }
}
