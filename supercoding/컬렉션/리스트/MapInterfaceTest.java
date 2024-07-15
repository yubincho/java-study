package supercoding.컬렉션.리스트;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

    public static void main(String[] args) {

        Map<String, Integer> fruitMap = new HashMap<>();

        fruitMap.put("Orange", 5);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 3);
        fruitMap.put("Kiwi", 20);

        System.out.println("fruitMap: " + fruitMap);  // fruitMap: {Apple=10, Kiwi=20, Orange=5, Banana=3}

        //
        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");

        System.out.println("사과 개수: " + appleCount);
        System.out.println("바나나 개수: " + bananaCount);

        //
        Boolean isApple = fruitMap.containsKey("Apple");
        Boolean isMango = fruitMap.containsKey("Mango");

        System.out.println(isApple);
        System.out.println(isMango);

        //
        fruitMap.remove("Apple");
        System.out.println(fruitMap);

        //
        System.out.println(fruitMap.size());

        //
        System.out.println(fruitMap.keySet()); // [Kiwi, Orange, Banana]


    }
}
