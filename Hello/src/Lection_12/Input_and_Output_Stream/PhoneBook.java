package Lection_12.Input_and_Output_Stream;

import java.io.File;

public interface PhoneBook {
    void addUser(String name, int number);

    int getNumberByName(String name) throws NameOfContactNotFoundException;

    String getNameByNumber(int number) throws NumberNotFoundException;

    void storeToFile(File phoneBookFile) throws NotValidFileExtensionException,
            FileCanNotBeWrittenException;

    void loadFromFile(File phoneBookFile) throws
            NotValidFileExtensionException, NotValidFileFormatException,
            FileNotFoundException, FileCanNotBeReadException;
}

