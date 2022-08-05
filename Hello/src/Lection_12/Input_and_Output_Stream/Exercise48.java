package Lection_12.Input_and_Output_Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Exercise48 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:/test/test2.txt");
        file.createNewFile();
        try (FileWriter writer = new FileWriter(file, false)) {
            System.out.println("������� ����� � �������");
            Scanner entireText = new Scanner(System.in);
            String str;
            str = entireText.nextLine();
            writer.write(str);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader(file)) {
            Scanner scanner = new Scanner(reader);
            String text = "";
            while (scanner.hasNext()) {
                text = text + scanner.nextLine();
            }
            System.out.println("�� ����� ��������� �����: " + text);
            text.trim();
            String[] num = text.split("\\D+");
            Integer[] numbers;
            if (num[0].matches("")) {
                int bufLength = num.length - 1;
                numbers = new Integer[bufLength];
                for (int i = 0; i < bufLength; i++) {
                    numbers[i] = Integer.valueOf(num[i + 1]);
                }
            } else {
                int bufLength = num.length;
                numbers = new Integer[bufLength];
                for (int i = 0; i < bufLength; i++) {
                    numbers[i] = Integer.valueOf(num[i]);
                }
            }
            List numbers2 = new ArrayList();
            System.out.print("�����, ������� ���������� � ������ ������: ");
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                numbers2.add(numbers[j]);
                sum = sum + (int) numbers2.get(j);
            }
            System.out.println(numbers2);
            System.out.println("����� ������ �����: " + sum);
            LinkedHashSet numbers3 = new LinkedHashSet();
            for (int j = 0; j < numbers2.size(); j++) {
                numbers3.add(numbers2.get(j));
            }
            System.out.print("����� �������� �������� �������� ��������� �����: ");
            System.out.println(numbers3);
            Iterator iterator = numbers3.iterator();
            int sum2 = 0;
            while (iterator.hasNext()) {
                sum2 = sum2 + (int) iterator.next();
            }
            System.out.println("����� ������ �����: " + sum2);
        }
        /*10 �������� ����������� �������, 1 �����������, �� �������� 9. 9 ��������, ����, ������� �����, 1 �� ���� ����������, �� �������� 8. 8 �������� � ����� ���� �����, 1 �� �����������, �������� ��������. 7 �������� ����� ������ ������, ������� 1 ���� � � �������� 6 ��. 6 �������� ����� �� ������ ������, ������ ������ �����, �� �������� 5. 5 �������� ��������� �������, �������� ������, �������� �� 4. 4 ���������� ����� �������� � ����, 1 ������� �� ��������, �� �������� ����. ���� �������� � �������� ���������, ������ ������� �������, � ������ ��������. ���� �������� ����� �� ����������, 1 ������ � � ��� 1, ����������, ��������. ��������� ���������� �������� ������, �� ����� ���������, � ������ �� �����.*/
    }
}


