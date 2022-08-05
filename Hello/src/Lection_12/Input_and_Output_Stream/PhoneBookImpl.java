package Lection_12.Input_and_Output_Stream;

import java.io.*;
import java.util.*;

public class PhoneBookImpl implements PhoneBook {

    HashMap<String, Integer> phoneNumbers = new HashMap<>();

    @Override
    public void addUser(String name, int number) {
        if (phoneNumbers.containsKey(name)) {
            phoneNumbers.put(name + 1, number);
            System.out.println("Контакт с именем " + name + " уже " +
                    "существует, добавлен контакт с именем " + name + 1
                    + " и номером телефона " + number);
        } else {
            phoneNumbers.put(name, number);
            System.out.println("Добавлен контакт с именем " + name
                    + " и номером телефона " + number);
        }
    }

    @Override
    public int getNumberByName(String name) throws
            NameOfContactNotFoundException {
        if (phoneNumbers.get(name) == null) {
            throw new NameOfContactNotFoundException("Нет контакта с таким " +
                    "именем");
        }
        return phoneNumbers.get(name);
    }

    @Override
    public String getNameByNumber(int number) throws NumberNotFoundException {
        String desiredName = "";
        for (Map.Entry entry : phoneNumbers.entrySet()) {
            if (entry.getValue().equals(number)) {
                desiredName = (String) entry.getKey();
            }
        }
        if (desiredName == "") {
            throw new NumberNotFoundException("Нет контакта с таким номером " +
                    "телефона");
        }
        return desiredName;
    }

    @Override
    public void storeToFile(File phoneBookFile) throws
            NotValidFileExtensionException, FileCanNotBeWrittenException {
        if (!phoneBookFile.getName().matches(".*[.]txt")) {
            throw new NotValidFileExtensionException("Указано неверное " +
                    "расширение файла");
        }
        if (!phoneBookFile.canWrite()) {
            throw new FileCanNotBeWrittenException("Невозможно осуществить " +
                    "запись в файл");
        }
        try (FileWriter writer = new FileWriter(phoneBookFile, false)) {
            for (Map.Entry entry : phoneNumbers.entrySet()) {
                writer.write(entry.getKey() + ", " + entry.getValue() + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) throws
            NotValidFileExtensionException, NotValidFileFormatException,
            FileNotFoundException, FileCanNotBeReadException {
        boolean fileExist = phoneBookFile.exists()
                && !phoneBookFile.isDirectory();
        if (fileExist == false) {
            throw new FileNotFoundException("Файл с таким именем не найден");
        }
        if (!phoneBookFile.getName().matches(".*[.]txt")) {
            throw new NotValidFileExtensionException("Указано неверное " +
                    "расширение файла");
        }
        if (!phoneBookFile.canRead()) {
            throw new FileCanNotBeReadException("Невозможно осуществить " +
                    "чтение из файла");
        }
        try (FileReader reader = new FileReader(phoneBookFile)) {
            Scanner scanner = new Scanner(reader);
            String text = "";
            while (scanner.hasNext()) {
                text = scanner.nextLine();
                if (!text.matches(".*, .*")) {
                    throw new NotValidFileFormatException("Некорректный " +
                            "формат файла - невозможно получить искомые " +
                            "данные");
                }
                String[] properties = text.split(", ");
                addUser(properties[0], Integer.parseInt(properties[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
