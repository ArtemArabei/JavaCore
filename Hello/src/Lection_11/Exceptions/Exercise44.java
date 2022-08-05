package Lection_11.Exceptions;

public class Exercise44 {
    void buyProduct(String product, int price) throws NoMilkException,
            NoExpenciveProductException {
        if (product == "молоко" || product == "сыр" || product == "творог") {
            throw new NoMilkException("Молочные продукты не берем - аллергия" +
                    " на молочку");
        }
        if (price > 20) {
            throw new NoExpenciveProductException("Слишком высокая цена - не" +
                    " достаточно денег в кошельке");
        }
        System.out.println("Успешно совершена покупка товара \"" + product
                + "\" за " + price + " рублей");
    }

    public static void main(String[] args) {
        Exercise44 shopping = new Exercise44();
        try {
            shopping.buyProduct("хлеб", 2);
            shopping.buyProduct("молоко", 3);
        } catch (NoMilkException e) {
        } catch (NoExpenciveProductException e) {
        }
    }
}
