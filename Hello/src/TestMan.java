import java.util.ArrayList;

public class TestMan {

    public static void printMemory() {
        System.out.println("Max mem: " + Runtime.getRuntime().maxMemory()/1000);
        System.out.println("Total mem: " + Runtime.getRuntime().totalMemory()/1000);
        System.out.println("Free mem: " + Runtime.getRuntime().freeMemory()/1000);
        System.out.println();
    }


    public static void main(String[] args) {
        printMemory();
        ArrayList list = new ArrayList();

        for (int i = 0; i < 15_000_00; i++) {
            list.add(new Man(i));
        }
        printMemory();
        Runtime.getRuntime().gc();
        printMemory();
    }
}