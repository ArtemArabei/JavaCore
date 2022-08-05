package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class FactoryCalculateSalary {

    public static void main(String[] args) {
        FactoryEmployee[] employees = {new FactoryDirector("������ ����",
                "��������", 10000, 10000, 10000, "���������"),
                new FactoryManager("������ ����", "��������� �������", 3000,
                        0, 0, "���������"),
                new FactoryWorker("������� �����", "�������", 0, 2000, 100,
                        "����������")};
        for (FactoryEmployee a : employees) {
            a.showProfile();
            a.calculate();
            System.out.println();
        }
    }
}
