package Lection_3.Operators.Control_Operators;

public class Exercise8 {
    public static void main(String[] args) {
        int amountOfMoney = (int) (Math.random() * 100);
        String rouble = "";
        if (amountOfMoney % 100 <= 10 || amountOfMoney % 100 >= 20) {
            switch (amountOfMoney % 10) {
                case 1:
                    rouble = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    rouble = "рубля";
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    rouble = "рублей";
                    break;
            }
        } else rouble = "рублей";
        System.out.println("Сумма в кошельке - " + amountOfMoney + " "
                + rouble);
    }
}
