package Lection_15.Lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        List<String> testStrings = new ArrayList<>();
        testStrings.add(null);
        testStrings.add("");
        testStrings.add("JAVA");
        testStrings.add("JOB");
        testStrings.add("JA");
        testStrings.add("NIRVANA");
        testStrings.add("NAME");
        testStrings.add("NA");
        testStrings.add("test");
        System.out.println("������ ����� ��� ������������ ������-���������:");
        System.out.println(testStrings);

        Predicate<String> isNull = (something) -> something != null;
        Predicate<String> isNotEmpty = (something) -> {
            if (something != null) return something != "";
            else return false;
        };
        Predicate<String> isMatches = (something) -> {
            if (something != null) return something.matches("(J||N).+A");
            else return false;
        };

        System.out.println("\n��������: ������ �� null:");
        for (String i : testStrings) {
            System.out.println("\"" + i + "\" - " + isNull.test(i));
        }
        System.out.println("\n��������: ������ �� �����:");
        for (String i : testStrings) {
            System.out.println("\"" + i + "\" - " + isNotEmpty.test(i));
        }
        System.out.println("\n��������: ������ c������������ �������:");
        for (String i : testStrings) {
            System.out.println("\"" + i + "\" - " + isMatches.test(i));
        }
    }
}


