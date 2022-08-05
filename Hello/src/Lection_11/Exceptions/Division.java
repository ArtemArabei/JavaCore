package Lection_11.Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Division {

    public List<Integer> createList() {
        Scanner entireText = new Scanner(System.in);
        String str;
        System.out.println("Для создания списка со значением null введите " +
                "null, для перехода к заполнению списка введите любое другое" +
                " значение");
        str = entireText.nextLine();
        List<Integer> arguments = new ArrayList();
        if (str.equals("null")) {
            arguments = null;
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество чисел в списке");
            int possibleNumberOfNumbers = in.nextInt();
            // возможное количество чисел в списке List
            for (int i = 0; i < possibleNumberOfNumbers; i++) {
                System.out.println("Введите число от 0 до 99 в список, для " +
                        "ввода значения null введите число 100");
                int number = in.nextInt();
                if (number == 100) {
                    arguments.add(null);
                } else
                    arguments.add(number);
            }
        }
        System.out.println("Список выглядит так:");
        System.out.println(arguments);
        return arguments;
    }

    public Integer divide(List<Integer> arguments) throws NullListException,
            NotValidNumberOfArgumentsException, NullArgumentException,
            DivisionByZeroException {
        int result;
        if (arguments == null) {
            throw new NullListException("Список имеет значение null");
        }
        if (!(arguments.size() > 1)) {
            throw new NotValidNumberOfArgumentsException("В списке " +
                    "содержится меньше 2 чисел");
        }
        if (arguments.get(0) == null || arguments.get(1) == null) {
            throw new NullArgumentException("Первое и/или второе число " +
                    "списка имеют значение null");
        }
        if (arguments.get(1) == 0) {
            throw new DivisionByZeroException("Второе число списка имеет" +
                    " значение 0, на 0 делить нельзя");
        }
        result = arguments.get(0) / arguments.get(1);
        return result;
    }
}
