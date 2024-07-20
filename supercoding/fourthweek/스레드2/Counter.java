package supercoding.fourthweek.스레드2;

public class Counter {

    private int count = 0;

    public synchronized void increment() {   // 임계영역 설정
        count++;
    }

    public int getCount() {
        return count;
    }
}
