package Lection_13.Threads;

public class MyThread2 implements Runnable {
    private int counter;
    static int globalCounter;
    private Integer globalCounterSync = 0;

    public void run() {
        while (counter < 50) {
            counter++;
            globalCounter++;
            synchronized (globalCounterSync) {
                globalCounterSync++;
                System.out.println(Thread.currentThread().getName() + " globalCounterSync = " + globalCounterSync);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " counter" + counter);
            System.out.println(Thread.currentThread().getName() + " globalCounter = " + globalCounter);
        }
    }

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread thread1 = new Thread(myThread2);
        thread1.start();
        Thread thread2 = new Thread(myThread2);
        thread2.start();
        Thread thread3 = new Thread(myThread2);
        thread3.start();
    }
}

