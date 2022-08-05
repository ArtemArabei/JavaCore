public class Gen<T extends A> {

    public Gen(T c) {
    }

    void printA(Gen<? extends A> value) {
        System.out.println(value);
    }

    void printB(Gen<? super B> value) {
        System.out.println(value);
    }

}
