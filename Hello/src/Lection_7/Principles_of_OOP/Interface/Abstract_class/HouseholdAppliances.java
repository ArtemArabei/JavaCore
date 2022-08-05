package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public abstract class HouseholdAppliances {

    void plugIn() {
        System.out.println("Прибор подключен к сети");
        doSomething();
    }

    abstract void doSomething();

    public static void main(String[] args) {
        HouseholdAppliances airCleaner = new AirCleaningAppliances();
        airCleaner.plugIn();
        HouseholdAppliances vacuumCleaner = new FloorCleaningAppliances();
        vacuumCleaner.plugIn();
        HouseholdAppliances megaCleaner = new CleaningAppliances();
        megaCleaner.plugIn();
    }
}