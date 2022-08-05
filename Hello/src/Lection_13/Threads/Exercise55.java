package Lection_13.Threads;

public class Exercise55 implements Runnable {

    public void run() {
        printAndSleep();
    }

    public synchronized void printAndSleep() {
        printName();
        sleep();
    }

    public void printName() {
        System.out.println(Thread.currentThread().getName() + ": отработал");

    }

    public void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Exercise55 myThreads = new Exercise55();
        for (int i = 0; i < 10; i++) {
            Thread threadi = new Thread(myThreads);
            threadi.start();
        }
    }
}
