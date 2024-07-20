package supercoding.fourthweek.스레드2;

public class JavaMultiThreadingIssue {

    public static void main(String[] args) {

        // 출력 문제 : 동기화 문제 발생 
        // 임계영역 설정 후 문제 해결

        Counter counter = new Counter();

        Thread thread1 = new Thread(new IncrementRunnable(counter));
        Thread thread2 = new Thread(new IncrementRunnable(counter));
        Thread thread3 = new Thread(new IncrementRunnable(counter));

        thread1.start();
        thread2.start();
        thread3.start();


        
        

    }
}
