package supercoding.fourthweek.스레드1;

public class PrintNumberRunnable implements Runnable{

    int start;
    int end;

    public PrintNumberRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        for(int i = start; i <= end; i++) {
            System.out.println(i + " ");
        }

    }
}
