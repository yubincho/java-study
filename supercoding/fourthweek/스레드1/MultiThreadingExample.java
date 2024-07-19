package supercoding.fourthweek.스레드1;

public class MultiThreadingExample {

    public static void main(String[] args) {

        // 1~ 100 까지 출력, 일 분담해서 실행


        Thread thread1 = new Thread(new PrintNumberRunnable(1, 50));
        Thread thread2 = new Thread(new PrintNumberRunnable(51, 100));
        Thread thread3 = new Thread(new PrintNumberRunnable(101, 130));

        thread1.start();
        thread2.start();
        thread3.start();







    }


}
