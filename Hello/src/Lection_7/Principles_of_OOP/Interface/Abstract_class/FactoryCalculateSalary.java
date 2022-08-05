package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class FactoryCalculateSalary {

    public static void main(String[] args) {
        FactoryEmployee[] employees = {new FactoryDirector("Иванов Иван",
                "директор", 10000, 10000, 10000, "смешанная"),
                new FactoryManager("Петров Петр", "начальник участка", 3000,
                        0, 0, "почасовая"),
                new FactoryWorker("Сидоров Сидор", "рабочий", 0, 2000, 100,
                        "процентная")};
        for (FactoryEmployee a : employees) {
            a.showProfile();
            a.calculate();
            System.out.println();
        }
    }
}
