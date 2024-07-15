package supercoding.컬렉션.리스트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GetPerformanceTest {

    static final int SIZE = 10000;

    public static void main(String[] args) {

        // List ArrayList
        List<Integer> integerList1 = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
        }

        // List LinkedList
        List<Integer> integerList2 = new LinkedList<>();

        for(int i = 0; i < SIZE; i++) {
            integerList2.add(i);
        }

        System.out.println("ArrayList: " + integerList1 );
        System.out.println("LinkedList: " + integerList2);

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        for(int i = 0; i < SIZE; i++) {
            integerList1.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList Get 요청 시간: " + (endTime - startTime));

        ///////////////////////////////////////////////

        startTime = System.currentTimeMillis();
        for(int i = 0; i < SIZE; i++) {
            integerList2.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList Get 요청 시간: " + (endTime - startTime));




    }
}
