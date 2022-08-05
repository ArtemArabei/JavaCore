package Lection_12.Input_and_Output_Stream;

import java.io.File;
import java.io.IOException;

public class TestPhoneBook {
    public static void main(String[] args) throws IOException {
        PhoneBook phoneBook = new PhoneBookImpl();
        phoneBook.addUser("Alex", 1234567);
        phoneBook.addUser("John", 1345234);
        phoneBook.addUser("Will", 3235667);
        phoneBook.addUser("Alex", 3456544);
        try {
            System.out.println(phoneBook.getNumberByName("Alex"));
            System.out.println(phoneBook.getNumberByName("Alex1"));
            System.out.println(phoneBook.getNumberByName("Alex") == 1234567);
            System.out.println(phoneBook.getNumberByName("Alex"));
            System.out.println(phoneBook.getNumberByName("Alex1"));
        } catch (NameOfContactNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(phoneBook.getNameByNumber(3456544));
            System.out.println(phoneBook.getNameByNumber(3456544).
                    equals("Alex1"));
        } catch (NumberNotFoundException e) {
            throw new RuntimeException(e);
        }
        File file = new File("c:/test/phoneBook.txt");
        file.createNewFile();
        try {
            phoneBook.storeToFile(file);
        } catch (NotValidFileExtensionException e) {
            throw new RuntimeException(e);
        } catch (FileCanNotBeWrittenException e) {
            throw new RuntimeException(e);
        }
        PhoneBook phoneBook2 = new PhoneBookImpl();
        try {
            phoneBook2.loadFromFile(file);
        } catch (NotValidFileExtensionException e) {
            throw new RuntimeException(e);
        } catch (NotValidFileFormatException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileCanNotBeReadException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(phoneBook2.getNumberByName("Alex") == 1234567);
            System.out.println(phoneBook2.getNumberByName("Alex")
                    == phoneBook.getNumberByName("Alex"));
        } catch (NameOfContactNotFoundException e) {
            throw new RuntimeException(e);
        }
        File file2 = new File("c:/test/phoneBook2.txt");
        file.createNewFile();
        try {
            phoneBook2.storeToFile(file2);
        } catch (NotValidFileExtensionException e) {
            throw new RuntimeException(e);
        } catch (FileCanNotBeWrittenException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(phoneBook.getNameByNumber(3456544));
            System.out.println(phoneBook2.getNameByNumber(1234567).
                    equals("Alex"));
            System.out.println(phoneBook2.getNameByNumber(3456544).
                    equals(phoneBook.getNameByNumber(3456544)));
        } catch (NumberNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
