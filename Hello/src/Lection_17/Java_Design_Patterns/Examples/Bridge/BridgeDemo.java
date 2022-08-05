package Lection_17.Java_Design_Patterns.Examples.Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Clothes shirt = new Shirt(new Printed(), new Large());
        System.out.println(shirt.make());
        Clothes shorts = new Shorts(new Black(), new Small());
        System.out.println(shorts.make());
        Clothes shorts2 = new Shorts(new White(), new Large());
        System.out.println(shorts2.make());
    }
}
