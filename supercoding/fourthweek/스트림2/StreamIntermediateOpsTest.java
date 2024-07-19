package supercoding.fourthweek.스트림2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpsTest {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        // fruit 이름 길이가 6이상인 과일마 선택
        fruits.stream()
                .filter((fruit) -> fruit.length() >= 6)
                .forEach((fruit) -> System.out.println("filter : " + fruit));

        List<String> fruitList = fruits.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct: " + fruitList);

        List<String> fruitListMap = fruits.stream()
                .map((fruit) -> fruit.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(fruitListMap);

        List<Integer> fruitListMap2 = fruits.stream()
                .map((fruit) -> fruit.length()) // 문자 길이로 반환
                .collect(Collectors.toList());
        System.out.println(fruitListMap2);


        List<String> fruitList3 = fruits.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(fruitList3);


        List<String> fruitList4 = fruits.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(fruitList4);

        List<String> fruitList5 = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(fruitList5);

        List<String> fruitLIst6 = fruits.stream()
                .sorted((fruit1, fruit2) -> fruit1.length() - fruit2.length())
                .collect(Collectors.toList());
        System.out.println(fruitLIst6);





    }
}
