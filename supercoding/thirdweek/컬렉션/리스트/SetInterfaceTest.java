package supercoding.thirdweek.컬렉션.리스트;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceTest {

    public static void main(String[] args) {

        Set<String> fruitSet = new HashSet<>();

        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");

        System.out.println(fruitSet); // [Orange, Apple, Mango, Grape, Apple] Apple 2번 주입됨

        //
        List<String> fruitLit = new ArrayList<>();
        fruitLit.add("Orange");
        fruitLit.add("Apple");
        fruitLit.add("Mango");
        fruitLit.add("Grape");
        fruitLit.add("Apple");  // ArrayList 중복 저장하기
        System.out.println(fruitLit);

        fruitSet.add("Apple");  //  Set 중복 저장하기
        System.out.println(fruitSet); // [Apple, Grape, Mango, Orange]

        //
        fruitSet.remove("Apple");
        System.out.println(fruitSet);

        //
        System.out.println(fruitSet.contains("Apple")); // false

        //
        System.out.println(fruitSet.size());

        fruitSet.clear();
        System.out.println(fruitSet.isEmpty());  // 비었는지 : true



    }
}
