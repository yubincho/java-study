package supercoding.fourthweek.스트림1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOpsTest {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        fruits.stream().forEach((fruit) -> System.out.println("forEach 출력 " + fruit) );

        Set<String> fruitSet = fruits.stream().collect(Collectors.toSet());
        System.out.println("fruit set: " + fruitSet);

        Optional<String> fruitOptional = fruits.stream().findFirst();
        System.out.println("optional fruit: " + fruitOptional.orElseGet(() -> "기본과일"));

        /////////

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println(integerList.stream().mapToInt((i) -> i).sum());
        System.out.println(integerList.stream().mapToInt((i) -> i).average());

        System.out.println(integerList.stream().count());
        System.out.println(integerList.stream().mapToInt((i) -> i).max());
        System.out.println(integerList.stream().mapToInt((i) -> i).min());

        int result = integerList.stream().reduce(0, (int1, int2) -> int1 + int2);
        System.out.println(result);


    }
}
