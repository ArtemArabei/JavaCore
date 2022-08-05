package Lection_12.Input_and_Output_Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFile {

    public static void main(String[] args) throws IOException {
        File f = new File("c:/test");
        f.mkdir();

        for (int i = 0; i < 10; i++) {
            File file = new File("c:/test/test" + (i + 1) + ".txt");
            file.createNewFile();
            try (FileWriter writer = new FileWriter(file, false)) {
                writer.write("java " + (i +1));
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        for (File file : f.listFiles()) {
            System.out.println(file.getName() + "1112");
            FileReader read = new FileReader(file);
                Scanner scanner = new Scanner(read);
                while (scanner.hasNext()) {
                    if (scanner.nextLine().equals("java 7")) {
                        System.out.println("Искомый файл - " + file.getName());

                    }
                }
            }
        }
    }