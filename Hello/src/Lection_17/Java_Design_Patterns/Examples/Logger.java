package Lection_17.Java_Design_Patterns.Examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public final class Logger {
    private static volatile Logger instance;
    public File file;

    private Logger(File file) {
        this.file = file;
    }

    public static Logger getInstance(File file) {
        Logger result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger(file);
            }
            return instance;
        }
    }

    public void logError(String typeOfError) {
        DateTimeFormatter format = DateTimeFormatter
                .ofPattern("dd-MM-yyyy HH:mm:ss:SSS");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileWriter writer;
        try {
            writer = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.write(typeOfError + " - "
                    + LocalDateTime.now().format(format) + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("В текстовый файл внесена запись об ошибке:\n"
                + typeOfError + " - " + LocalDateTime.now().format(format)
                + "\n");
    }
}