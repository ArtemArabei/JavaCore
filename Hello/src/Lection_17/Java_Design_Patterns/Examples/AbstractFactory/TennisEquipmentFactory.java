package Lection_17.Java_Design_Patterns.Examples.AbstractFactory;

public interface TennisEquipmentFactory {
    public abstract TennisBall createTennisBall();
    public abstract TennisRacket createTennisRacket();
    public abstract TennisNet createTennisNet();
}
