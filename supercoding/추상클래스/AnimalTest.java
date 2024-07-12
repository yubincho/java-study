package supercoding.추상클래스;

public class AnimalTest {

    public static void main(String[] args) {

//        Animal animal = new Animal(); // 추상클래스라서 인스턴스화 불가. 에러 발생
        Animal animal1 = new Bird();
        Animal animal2 = new Fish();
        Animal animal3 = new Person();
        Animal animal4 = new Dog();

//        feed(animal, "뺴뺴로");
        feed(animal1, "벌레");
        feed(animal2, "모이");
        feed(animal3, "김밥");
        feed(animal4, "고기");

    }

    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
