public class A {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Gen<A> gen = new Gen<>(c);
        gen.printA(gen);
    }
}
