package Lection_14.Multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable implements Callable {
    private String name;

    public TestCallable(String name) {
        this.name = name;
    }

    public ArrayList<String> call() {
        ArrayList<String> fileNames = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String fileName = "c:/test/" + name + i + ".txt";
            try (FileWriter writer = new FileWriter(fileName, false)) {
                String text = "Hello Gold!";
                writer.write(text);
                for (int j = 0; j < 9; j++) {
                    writer.append(System.lineSeparator());
                    writer.append("new line " + j);
                }
                writer.flush();
                fileNames.add(fileName);
                System.out.println(Thread.currentThread().getName() + " is generating file: " + fileName);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return fileNames;
    }


    public static void main(String args[]) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        Set<Future<ArrayList<String>>> set = new HashSet<Future<ArrayList<String>>>();
        for (int i = 0; i < 10; i++) {
            Callable<ArrayList<String>> callable = new TestCallable("notes_" + i);
            Future<ArrayList<String>> future = pool.submit(callable);
            set.add(future);
        }

        for (Future<ArrayList<String>> future : set) {
            for (String res : future.get()) {
                System.out.println(Thread.currentThread().getName() + " is printing file: " + res);
            }
        }
    }
}