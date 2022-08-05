package Lection_15.Lambda_expressions;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Exercise60_1 implements Callable {

    public Object call() {
        return null;
    }

    public static void main(String args[]) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<String>> set =
                new LinkedHashSet<>();
        File file = new File("c:/test/test60.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            Future<String> future = pool.submit(() -> {
                System.out.println(Thread.currentThread().getName()
                        + ": приступает к записи в файл");
                synchronized (file) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    Date date = new Date();
                    try (FileWriter writer = new FileWriter(file, true)) {
                        writer.write("Hello World - " + date + "\n");
                        writer.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    String result = "\t" + Thread.currentThread().getName()
                            + ": записал в файл: Hello World - " + date;
                    System.out.println(result);
                    return result;
                }
            });
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