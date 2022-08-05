public class Cat extends Animal {
    @Override
    public void voice () {
        System.out.println("Meow");
    }
    public static void main(String[] args) {
        Cat catBoris = new Cat();
        catBoris.voice();
    }
}