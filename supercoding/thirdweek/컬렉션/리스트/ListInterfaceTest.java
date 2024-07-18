package supercoding.thirdweek.컬렉션.리스트;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {

    public static void main(String[] args) {

        // List 정의
        List<String> fruitList = new ArrayList<>();

        // add
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");
        System.out.println("FruitList 요소 : " + fruitList);

        // add(index, element)
        fruitList.add(3, "Mango");
        System.out.println("FruitList 요소 : " + fruitList);

        //remove(index)
        fruitList.remove(3);
        System.out.println("FruitList 요소 : " + fruitList);

        // get(index)
        String myFruit = fruitList.get(3);
        System.out.println("My Fruit: " + myFruit);


        // set(index, element)
        fruitList.set(1, "PineApple");
        System.out.println("FruitList 요소 : " + fruitList);

        // size
        System.out.println("리스트 사이즈 " + fruitList.size());

        // isEmpty
        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList2.isEmpty());  // true
        System.out.println(fruitList.isEmpty());   // false

        // contains : 리스트의 해당 원소가 있는지 없는지 확인하는 메서드
        System.out.println(fruitList.contains("Kiwi"));
        System.out.println(fruitList.contains("Apple"));

        // indexOf, clear
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));

        fruitList.clear();
        System.out.println("FruitList 요소 : " + fruitList);


    }
}
