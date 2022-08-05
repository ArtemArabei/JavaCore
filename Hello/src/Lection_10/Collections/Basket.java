package Lection_10.Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Basket {

    private List<Product> products;

    Basket(List<Product> products) {
        this.products = products;
    }

    public void showProducts(Basket basket) {
        int expenses = 0;
        System.out.println();
        for (int i = 0; i < products.size(); i++) {
            System.out.println("����� - " + products.get(i).getName()
                    + ",\t���� - " + products.get(i).getPrice()
                    + "$ /��.\t���������� - " + products.get(i).getAmount()
                    + " ��.");
            expenses = expenses + products.get(i).getPrice()
                    * products.get(i).getAmount();
        }
        System.out.println("����� ������� �� ����� - " + expenses + "$");
    }

    public void addProduct(String name, int price, int amount) {
        boolean isFind = false;
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i).getName() == name)) {
                int newAmount = (products.get(i).getAmount() + amount);
                System.out.println();
                System.out.println("���������� ��������, ��� ������������ � " +
                        "�������, ���������");
                products.get(i).setAmount(newAmount);
                isFind = true;
            }
        }
        if (isFind == false) {
            products.add(new Product(name, price, amount));
            System.out.println();
            System.out.println("� ������� �������� ����� �������");
        }
    }

    public void sortProducts(String sortCriterion) {
        switch (sortCriterion) {
            case "name":
                Collections.sort(products, Comparator.comparing(Product::
                        getName));
                System.out.println();
                System.out.print("������ �������, �������������� �� " +
                        "��������, �������� ���:");
                break;
            case "price":
                Collections.sort(products, Comparator.comparing(Product::
                        getPrice));
                System.out.println();
                System.out.print("������ �������, �������������� �� " +
                        "����, �������� ���:");
                break;
            case "amount":
                Collections.sort(products, Comparator.comparing(Product::
                        getAmount));
                System.out.println();
                System.out.print("������ �������, �������������� �� " +
                        "����������, �������� ���:");
                break;
        }
    }
}
