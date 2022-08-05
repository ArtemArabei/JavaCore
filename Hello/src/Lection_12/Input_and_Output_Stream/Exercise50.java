package Lection_12.Input_and_Output_Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) throws IOException {
        File directory1 = new File("c:/test1/");
        directory1.mkdir();
        File directory2 = new File("c:/test1/test2");
        directory2.mkdir();
        File directory3 = new File("c:/test1/test2/test3");
        directory3.mkdir();
        System.out.println("Созданы следующие папки:");
        System.out.println("c:" + directory1.getName());
        System.out.println("c:" + directory1.getName() + "/" +
                directory2.getName());
        System.out.println("c:" + directory1.getName() + "/" +
                directory2.getName() + "/" + directory3.getName());
        System.out.println("В папке c:" + directory1.getName() + "/"
                + directory2.getName() + "/" + directory3.getName()
                + " созданы следующие файлы:");
        for (int i = 1; i <= 5; i++) {
            File file = new File("c:/test1/test2/test3/test0" + i + ".txt");
            file.createNewFile();
        }
        for (File file : directory3.listFiles()) {
            if (file.isFile() == true) {
                try (FileWriter writer = new FileWriter(file, false)) {
                    for (int j = 0; j < 10; j++) {
                        int rand = (int) (Math.random() * 100);
                        String random = Integer.toString(rand);
                        writer.write(random);
                        writer.write(", ");
                    }
                    writer.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                System.out.println(file.getName());
            }
        }
        File summaryFile = new File("c:/test1/test2/test3/testSummary.txt");
        summaryFile.createNewFile();
        String summary = "";
        for (File file : directory3.listFiles()) {
            System.out.println("В файле " + file.getName()
                    + " записаны следующие числа:");
            FileReader read = new FileReader(file);
            Scanner scanner = new Scanner(read);
            while (scanner.hasNext()) {
                String str = "";
                str = str + scanner.nextLine();
                System.out.println(str);
                summary = summary + str;
                try (FileWriter writer2 = new FileWriter(summaryFile, false)) {
                    writer2.write(summary);
                    writer2.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        File listOfFiles = new File("c:/test1/test2/test3/listOfFiles.txt");
        listOfFiles.createNewFile();
        String listOfAllFiles = "";
        for (File file : directory3.listFiles()) {
            if (file.isFile() == true) {
                try (FileWriter writer3 = new FileWriter(listOfFiles, false)) {
                    listOfAllFiles = listOfAllFiles + file.getName() + ", ";
                    writer3.write(listOfAllFiles);
                    writer3.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        System.out.println("В файле " + listOfFiles.getName()
                + " записан следующий список файлов:");
        FileReader read2 = new FileReader(listOfFiles);
        Scanner scanner = new Scanner(read2);
        while (scanner.hasNext()) {
            String str = "";
            str = str + scanner.nextLine();
            System.out.println(str);
        }
    }
}
