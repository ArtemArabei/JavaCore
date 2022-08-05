package Lection_11.Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exception2 {

    public void readFile(String path) throws IOException {
        File f = new File(path);
        try {
            BufferedReader fin = new BufferedReader(new FileReader(f));
            String line;
            while ((line = fin.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws IOException {
        Exception2 test = new Exception2();
        test.readFile("c:\\Users\\Artem\\TestException.txt");
        test.readFile("c:\\Users\\Artem\\TestException2.txt");
    }
}
