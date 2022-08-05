package Lection_13.Threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Exercise54 extends Thread {

    public void run() {
        try {
            storeToFile(generateArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int[] generateArray() {
        int numberOfNumbers = 10; // ���������� ����� ����� � �������
        int maxValue = 1000; // ������������ �������� ����� ����� (���
        // ��������� ��������)
        Random rand = new Random();
        int[] array = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            array[i] = rand.nextInt(maxValue);
        }
        System.out.println(getName() + ": ������ ������� �� ��������� �����: "
                + Arrays.toString(array));
        return array;
    }

    public void storeToFile(int[] array) throws IOException {
        try (FileWriter writer = new FileWriter("c:/test/test11.txt", true)) {
            writer.write(Arrays.toString(array) + "\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("c:/test/test11.txt");
        file.createNewFile();
        for (int i = 0; i < 5; i++) {
            Exercise54 myThreadi = new Exercise54();
            myThreadi.start();
        }
    }
}

