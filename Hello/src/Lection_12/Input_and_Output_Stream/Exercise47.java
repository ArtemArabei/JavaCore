package Lection_12.Input_and_Output_Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise47 {
    public static void main(String[] args) throws IOException {
        File directory = new File("c:/test");
        directory.mkdir();
        File file = new File("c:/test/test.txt");
        file.createNewFile();
        try (FileWriter writer = new FileWriter(file, false)) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество строк, которые " +
                    "собираетесь записать в файл");
            int numberOfLines = in.nextInt();
            System.out.println("Введите строки, которые собираетесь записать" +
                    " в файл");
            Scanner entireText = new Scanner(System.in);
            String str;
            for (int i = 0; i < numberOfLines; i++) {
                str = entireText.nextLine() + " ";
                writer.write(str);
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader(file);) {
            Scanner scanner = new Scanner(reader);
            String text = "";
            while (scanner.hasNext()) {
                text = text + scanner.nextLine();
            }
            System.out.println("Вы ввели следующий текст: " + text);
            char[] symbol = {'.', ',', '!', '?', ':', ';', '-'};
            char[] symbols = text.toCharArray();
            int count = 0;
            for (int i = 0; i < symbols.length; i++) {
                for (int j = 0; j < symbol.length; j++) {
                    if (symbols[i] == symbol[j])
                        count++;
                }
            }
            System.out.println("Количество знаков препинания в тексте равно " +
                    "- " + count);

            text = text.trim();
            int count2 = 1;
            Pattern p = Pattern.compile(" +");
            Matcher matcher = p.matcher(text);
            while (matcher.find()) {
                count2++;
            }
            System.out.println("Количество слов в тексте равно - " + count2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


