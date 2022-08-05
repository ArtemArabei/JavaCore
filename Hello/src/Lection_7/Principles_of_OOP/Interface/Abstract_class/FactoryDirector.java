package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class FactoryDirector extends FactoryManager {

    FactoryDirector(String name, String post, int salary, int bonus, int plan,
                    String payrollMethod) {
        super(name, post, salary, bonus, plan, payrollMethod);
    }

    @Override
    public void calculate() {
        int salary = calculateSalary(10000, daysInMonth)
                + calculateBonus(10000, 10000);
        System.out.println("Начисленная зарплата составила: " + salary + " $");
    }

    int calculateBonus(int bonus, int plan) {
        int result = generateEfficiency(plan);
        salary = bonus * result / plan;
        return salary;
    }
}
