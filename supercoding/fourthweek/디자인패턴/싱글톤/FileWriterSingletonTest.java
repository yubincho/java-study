package supercoding.fourthweek.디자인패턴.싱글톤;

public class FileWriterSingletonTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
           writer.writeToFile("Thread 1: Message 1");
           writer.writeToFile("Thread 1: Message 2");

        });

        Thread thread2 = new Thread(() -> {
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
            writer.writeToFile("Thread 2: Message 3");
            writer.writeToFile("Thread 2: Message 4");

        });

        // 계속 복사해서 사용하면 됨
        // 하지만 동일한 반복 수행의 문제
        // 한 번 사용 후 가비지 콜렉터 회수 문제 => 그래서 싱글톤 사용 

        thread1.start();
        thread2.start();



    }
}
