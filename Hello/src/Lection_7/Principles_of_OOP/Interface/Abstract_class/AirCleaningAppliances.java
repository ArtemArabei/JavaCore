package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class AirCleaningAppliances extends CleaningAppliances {
    @Override
    void cleanSomething() {
        System.out.println("Очиститель воздуха произвел очистку воздуха в " +
                "помещении");
    }
}
