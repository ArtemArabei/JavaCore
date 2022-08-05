package Lection_14.Multithreading;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Exercise60 implements Callable {

    public synchronized String call() {
        System.out.println(Thread.currentThread().getName()
                + ": приступает к записи в файл");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String result = "\t" + Thread.currentThread().getName()
                + ": записал в файл: Hello World - " + writeFile();
        System.out.println(result);
        return result;
    }

    public Date writeFile() {
        File file = new File("c:/test/test60.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Date date = new Date();
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Hello World - " + date + "\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

    public static void main(String args[]) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<String>> set =
                new LinkedHashSet<Future<String>>();
        Callable<String> callable = new Exercise60();
        for (int i = 0; i < 10; i++) {
            Future<String> future = pool.submit(callable);
            set.add(future);
        }

        for (Future<String> future : set) {
            try {
                System.out.println("\t\t" + Thread.currentThread().getName()
                        + ": получил результат: " + future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        pool.shutdown();
    }
}