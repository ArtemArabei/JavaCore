package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class CleaningAppliances extends HouseholdAppliances {

    @Override
    void doSomething() {
        cleanSomething();
    }

    void cleanSomething() {
        System.out.println("Супер система комплексной очистки очистила все " +
                "помещение");
    }
}
