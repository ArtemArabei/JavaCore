package Lection_13.Threads;

public class MyThread extends Thread {
    private int counter;
    static int globalCounter;
    private Integer globalCounterSync = 0;

    public void run() {
        while (counter < 50) {
            counter++;
            globalCounter++;
            synchronized (globalCounterSync) {
                globalCounterSync++ ;
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
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
