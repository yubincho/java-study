package supercoding.fourthweek.스레드1;

public class JavaThreading {

    public static void main(String[] args) {

        // Thread 실행
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        System.out.println("Thread " + Thread.currentThread().getName() + "이 실행하고 있습니다.");

        thread1.start();
        thread2.start();

        System.out.println("Thread " + Thread.currentThread().getName() + "이 실행하고 있습니다.");

//        Thread main이 실행하고 있습니다.
//        Thread main이 실행하고 있습니다.
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
