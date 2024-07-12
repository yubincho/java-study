package supercoding.상속;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal1 = new Bird();
        Animal animal2 = new Fish();

        feed(animal, "뺴뺴로");
        feed(animal1, "벌레");
        feed(animal2, "모이");

    }

    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
