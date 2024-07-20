package assignment4week_정답아님.fifthDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeThreadsListFiller {

    public static void main(String[] args) {
        // TODO: 작업할 List 생성
        int listSize = 1000;
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        // 결과 확인
//        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);

        // TODO: 3개의 쓰레드 생성, 업무 분담 실행
        Thread thread1 = new Thread(new ListFillerTask(list, listSize));
        Thread thread2 = new Thread(new ListFillerTask(list, listSize));;
        Thread thread3 = new Thread(new ListFillerTask(list, listSize));;

        // TODO: 3개 Thread 작업 진행
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // 스레드들의 작업 완료를 기다립니다.
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);
    }

    // TODO: 자신이 맡은 리스트 인덱스의 값을 각각 0, 1, 2로 채우도록 구현하는 Task 구현 필요
    static class ListFillerTask implements Runnable {

        private List<Integer> list = new ArrayList<>();
        private final int[] numList = {0, 1, 2};
        private int listSize;

        public ListFillerTask(List<Integer> list, int listSize) {
            this.list = list;
            this.listSize = listSize;
        }


        @Override
        public void run() {
            // TODO
            for (int i = 0; i < listSize; i++) {
                list.add(numList[i % 3]);
            }
        }
    }
}
