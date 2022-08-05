package Lection_11.Exceptions;

public class TestDivision {
    public static void main(String[] args) {
        Division division = new Division();
        try {
            System.out.println("Результат следующий: "
                    + division.divide(division.createList()));
        } catch (NullListException e) {
            throw new RuntimeException(e);
        } catch (NotValidNumberOfArgumentsException e) {
            throw new RuntimeException(e);
        } catch (NullArgumentException e) {
            throw new RuntimeException(e);
        } catch (DivisionByZeroException e) {
            throw new RuntimeException(e);
        }
    }
}
