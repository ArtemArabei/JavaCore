package Lection_12.Input_and_Output_Stream;

import java.io.File;
import java.io.IOException;

public class Exercise46 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Artem\\Desktop\\Core Java");
        System.out.println("Список файлов в выбранной директории следующий:");
        for (File file : f.listFiles()) {
            if (file.isFile() == true) {
                System.out.println(file.getName());
            }
        }
        System.out.println();
        System.out.println("Список папок в выбранной директории следующий:");
        for (File file : f.listFiles()) {
            if (file.isDirectory() == true) {
                System.out.println(file.getName());
            }
        }
    }
}
