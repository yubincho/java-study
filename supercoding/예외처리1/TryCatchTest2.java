package supercoding.예외처리1;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("I");
        stringList.add("Love");
        stringList.add(null);
        stringList.add("Coding");

        for(int i = 0; i < stringList.size() + 5; i++) {
            try {
                System.out.println("i: " + i);
                String str = stringList.get(i);
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("null은 들어갈 수 없습니다.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index는 Array Bound를 넘어갈 수 없습니다.");
                break;
            }
        }


    }
}
