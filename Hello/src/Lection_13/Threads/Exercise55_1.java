package Lection_13.Threads;

public class Exercise55_1 implements Runnable {

    public void run() {
        System.out.println(printName());
    }

    public synchronized String printName() {
        String printedName = Thread.currentThread().getName() + ": отработал";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return printedName;
    }

    public static void main(String[] args) {
        Exercise55_1 myThreads = new Exercise55_1();
        for (int i = 0; i < 10; i++) {
            Thread threadi = new Thread(myThreads);
            threadi.start();
        }
    }
}
