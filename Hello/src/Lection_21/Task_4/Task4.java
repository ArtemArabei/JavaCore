package Lection_21.Task_4;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task4 {

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        Set<Future<String>> set1 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<String> callable1 = new PlayerGeneratorTask(i);
            Future<String> future = pool.submit(callable1);
            set1.add(future);
        }
        Set<String> pathes = new HashSet<>();
        for (Future<String> future : set1) {
            pathes.add(future.get());
        }
        Set<Future<Players>> set2 = new HashSet<Future<Players>>();
        for (String p : pathes) {
            Callable<Players> callable2 = new PlayerReaderTask(p);
            Future<Players> future2 = pool.submit(callable2);
            set2.add(future2);
        }
        Set<Player> set3 = new HashSet();
        for (Future<Players> future : set2) {
            set3.addAll(future.get().getPlayers());
        }
        System.out.println("ÐÅÇÓËÜÒÀÒ ÂÛÏÎËÍÅÍÈß ÏÐÎÃÐÀÌÌÛ:");
        set3.stream()
                .sorted(Comparator.comparing(Player::getAge))
                .limit(5)
                .forEach(s -> System.out.println(s));
        pool.shutdown();
    }
}
