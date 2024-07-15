package supercoding.컬렉션.리스트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {

    static final int SIZE = 10000;

    public static void main(String[] args) {

        long startTime;
        long endTime;

        // List ArrayList
        startTime = System.currentTimeMillis();
        List<Integer> integerList1 = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
            if (i % 5 == 0) integerList1.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList 삽입/삭제 걸린 시간: " + (endTime - startTime));


        // List LinkedList
        startTime = System.currentTimeMillis();
        List<Integer> integerList2 = new LinkedList<>();
        for(int i = 0; i < SIZE; i++) {
            integerList2.add(i);
            if (i % 5 == 0) integerList1.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList 삽입/삭제 걸린 시간: " + (endTime - startTime));


    }
}
