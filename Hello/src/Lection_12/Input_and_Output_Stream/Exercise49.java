package Lection_12.Input_and_Output_Stream;

import java.io.*;

public class Exercise49 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        DataOutputStream testWriteData;
        testWriteData = new DataOutputStream(new BufferedOutputStream
                (new FileOutputStream("c:/test/test3.dat")));
        for (int i = 0; i < 20; i++) {
            double rand = Math.random();
            testWriteData.writeDouble(rand);
        }
        testWriteData.flush();
        DataInputStream testReadData;
        testReadData = new DataInputStream(new BufferedInputStream
                (new FileInputStream("c:/test/test3.dat")));
        double res = testReadData.readInt();
        double sum = 0;
        while (true) {
            System.out.println(res);
            sum = sum + res;
            try {
                res = testReadData.readDouble();
            } catch (EOFException e) {
                break;
            }
        }
        double average = sum / 20;
        System.out.println("Сумма чисел равна " + sum);
        System.out.println("Среднее арифметическое чисел равно  " + average);
        if (testReadData != null) {
            testReadData.close();
        }
    }
}
