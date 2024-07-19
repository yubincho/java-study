package supercoding.fourthweek.스레드1;

public class JavaThreading2 {

    public static void main(String[] args) {

        // Thread 실행
        Thread thread1 = new Thread(new MyRunnable());

        // 익명 클래스
        Thread thread2 = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("Thread " + Thread.currentThread().getName() + "이 실행하고 있습니다.");
            }
        });

        // 람다식
        Thread thread3 = new Thread(() -> System.out.println("Thread " + Thread.currentThread().getName() + "이 실행하고 있습니다."));

        System.out.println("Thread " + Thread.currentThread().getName() + "이 실행하고 있습니다.");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Thread " + Thread.currentThread().getName() + "이 실행하고 있습니다.");

//        Thread main이 실행하고 있습니다.
//        Thread main이 실행하고 있습니다.
//        Thread Thread-2이 실행하고 있습니다.
//        Thread Thread-0이 실행하고 있습니다.
//        Thread Thread-1이 실행하고 있습니다.
    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getName() + "이 실행하고 있습니다.");
        }
    }
}
