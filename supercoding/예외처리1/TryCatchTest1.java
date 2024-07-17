package supercoding.예외처리1;

public class TryCatchTest1 {
    public static void main(String[] args) {

        try {
            int i = 0;
            int data = 50 / i;
            System.out.println("data: " + data);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("0으로는 나눌 수 없습니다.");
            System.out.println("data: " + 0);
        }


    }
}
