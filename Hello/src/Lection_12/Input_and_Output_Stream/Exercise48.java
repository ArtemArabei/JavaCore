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
            System.out.println("Введите текст с числами");
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
            System.out.println("Вы ввели следующий текст: " + text);
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
            System.out.print("Числа, которые содержатся в данном тексте: ");
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                numbers2.add(numbers[j]);
                sum = sum + (int) numbers2.get(j);
            }
            System.out.println(numbers2);
            System.out.println("Сумма данных чисел: " + sum);
            LinkedHashSet numbers3 = new LinkedHashSet();
            for (int j = 0; j < numbers2.size(); j++) {
                numbers3.add(numbers2.get(j));
            }
            System.out.print("После удаления повторов остались следующие числа: ");
            System.out.println(numbers3);
            Iterator iterator = numbers3.iterator();
            int sum2 = 0;
            while (iterator.hasNext()) {
                sum2 = sum2 + (int) iterator.next();
            }
            System.out.println("Сумма данных чисел: " + sum2);
        }
        /*10 негритят отправились обедать, 1 поперхнулся, их осталось 9. 9 негритят, поев, клевали носом, 1 не смог проснуться, их осталось 8. 8 негритят в Девон ушли потом, 1 не возвратился, остались всемером. 7 негритят дрова рубили вместе, Зарубил 1 себя — и осталось 6 их. 6 негритят пошли на пасеку гулять, Одного ужалил шмель, их осталось 5. 5 негритят судейство учинили, Засудили одного, осталось их 4. 4 негритенка пошли купаться в море, 1 попался на приманку, их осталось трое. Трое негритят в зверинце оказались, Одного схватил медведь, и вдвоем остались. Двое негритят легли на солнцепеке, 1 сгорел — и вот 1, несчастный, одинокий. Последний негритенок поглядел устало, Он пошел повесился, и никого не стало.*/
    }
}


