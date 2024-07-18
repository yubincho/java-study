package supercoding.thirdweek.예외처리2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyCloseTest2 {

    public static void main(String[] args) throws IOException {

        System.out.println("메인 메소드가 실행됩니다.");

        try(FileInputStream fs = new FileInputStream("C:\\Users\\user\\Documents\\codingTest\\supercoding\\예외처리1\\연습.txt")) {
            int i;
            while((i=fs.read()) != -1) {
                System.out.write(i);
            }

            int myInt = 10;
            int data = 100 / myInt;

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제가 발생하였습니다.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace();
        }

        System.out.println("메인 메소드가 종료됩니다..");

    }
}
