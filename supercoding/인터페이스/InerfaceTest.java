package supercoding.인터페이스;

import supercoding.상속.Animal;

public class InerfaceTest {

    public static void main(String[] args) {

        System.out.println(Flyable.atmosphereLimit);

        Flyable bird = new Bird();
        Flyable airplane = new Airplane("AB1112");

        bird.fly();
        airplane.fly();

//        bird.eat() // 에러남. 왜냐면 타입이 Flyable 이기 때문.

//        Walkable person = new Person();
        Person person = new Person();
        Walkable robot = new Robot("RB1233");
        person.setName("아이유");

        person.walk();
        robot.walk();

        if (robot instanceof Robot) { // 다운캐스팅
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person);
        }

    }
}
