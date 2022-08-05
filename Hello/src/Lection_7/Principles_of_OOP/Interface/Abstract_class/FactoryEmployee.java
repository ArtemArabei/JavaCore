package Lection_7.Principles_of_OOP.Interface.Abstract_class;

import java.util.Random;

public abstract class FactoryEmployee {

    public String name;
    public String post;
    public String payrollMethod;
    public int salary;
    public int bonus;
    public int plan;
    public int daysInMonth = 22;

    FactoryEmployee(String name, String post, int salary, int bonus, int plan,
                    String payrollMethod) {
        this.name = name;
        this.post = post;
        this.salary = salary;
        this.bonus = bonus;
        this.plan = plan;
        this.payrollMethod = payrollMethod;
    }

    void showProfile() {
        String personalProfile;
        personalProfile = name + " - " + post + ", оклад - " + salary +
                " $, бонус за выполненный план - " + bonus + " $, план - "
                + plan + " единиц продукции" + ", форма оплаты - "
                + payrollMethod;
        System.out.println(personalProfile);
    }

    int generateAttendance(int daysInMonth) {
        int[] attendance = new int[daysInMonth];
        int sumOfDays = 0;
        Random rand = new Random();
        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = rand.nextInt(2);
            sumOfDays += attendance[i];
        }
        System.out.print("Табель посещаемости сотрудника " + name + ": ");
        for (int element : attendance) {
            System.out.print(element + " ");
        }
        System.out.println("\nВсего отработано дней: " + sumOfDays + " из "
                + daysInMonth + " рабочих дней месяца");
        return sumOfDays;
    }

    int generateEfficiency(int plan) {
        int result = plan * (int) (Math.random() * 200) / 100;
        System.out.println("План был: " + plan + " единиц продукции, " +
                "выполнено: " + result + " единиц продукции");
        return result;
    }

    public abstract void calculate();
}
