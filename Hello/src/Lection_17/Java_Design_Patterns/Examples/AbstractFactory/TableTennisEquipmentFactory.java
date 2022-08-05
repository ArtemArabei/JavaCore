package Lection_17.Java_Design_Patterns.Examples.AbstractFactory;

public class TableTennisEquipmentFactory implements TennisEquipmentFactory{
    @Override
    public TennisBall createTennisBall() {
        return new TableTennisBall();
    }

    @Override
    public TennisRacket createTennisRacket() {
        return new TableTennisRacket();
    }

    @Override
    public TennisNet createTennisNet() {
        return new TableTennisNet();
    }
}
