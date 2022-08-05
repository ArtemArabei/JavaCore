package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class FactoryWorker extends FactoryEmployee {

    FactoryWorker(String name, String post, int salary, int bonus, int plan,
                  String payrollMethod) {
        super(name, post, salary, bonus, plan, payrollMethod);
    }

    @Override
    public void calculate() {
        calculateBonus(2000, 100);
        System.out.println("Начисленная зарплата составила: " + salary + " $");
    }

    int calculateBonus(int bonus, int plan) {
        int result = generateEfficiency(plan);
        salary = bonus * result / plan;
        return salary;
    }
}
