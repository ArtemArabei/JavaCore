public class AnimalWorld {
    void getAnimalVoise(Animal animal) {
        animal.voice();
    }
    public static void main(String[] args) {
        Animal[] animals = {new Cat(),new Dog(),new Cat(),new Cat(),new Dog()};
        for (Animal a: animals)
            a.getAnimalVoise(a);
    }
}
