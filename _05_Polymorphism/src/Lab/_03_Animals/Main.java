package Lab._03_Animals;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "Jerry");
        Dog dog = new Dog("Spike", "Tom");

        makeAnimalPresentThemself(cat);
        makeAnimalPresentThemself(dog);
    }

    public static void makeAnimalPresentThemself(Animal animal) {
        System.out.println(animal.explainSelf());
    }
}
