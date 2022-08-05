package Lection_11.Exceptions;

public class Exercise44 {
    void buyProduct(String product, int price) throws NoMilkException,
            NoExpenciveProductException {
        if (product == "������" || product == "���" || product == "������") {
            throw new NoMilkException("�������� �������� �� ����� - ��������" +
                    " �� �������");
        }
        if (price > 20) {
            throw new NoExpenciveProductException("������� ������� ���� - ��" +
                    " ���������� ����� � ��������");
        }
        System.out.println("������� ��������� ������� ������ \"" + product
                + "\" �� " + price + " ������");
    }

    public static void main(String[] args) {
        Exercise44 shopping = new Exercise44();
        try {
            shopping.buyProduct("����", 2);
            shopping.buyProduct("������", 3);
        } catch (NoMilkException e) {
        } catch (NoExpenciveProductException e) {
        }
    }
}
