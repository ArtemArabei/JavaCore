package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class FactoryManager extends FactoryEmployee {

    FactoryManager(String name, String post, int salary, int bonus, int plan,
                   String payrollMethod) {
        super(name, post, salary, bonus, plan, payrollMethod);
    }

    @Override
    public void calculate() {
        int salary = calculateSalary(3000, daysInMonth);
        System.out.println("Начисленная зарплата составила: " + salary + " $");
    }

    int calculateSalary(int salary, int daysInMonth) {
        int sumOfDays = generateAttendance(daysInMonth);
        salary = salary * sumOfDays / daysInMonth;
        return salary;
    }
}
