package supercoding.thirdweek.예외처리2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {

    public static void main(String[] args) {

        try {
            FileInputStream fs = new FileInputStream("C:\\Users\\user\\Documents\\codingTest\\supercoding\\예외처리1\\연습.txt");

            int i = 10;
            int data = 100 / i;

            String str = "abc";
            System.out.println(str.toUpperCase());

            int index = 10;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception이 발생했습니다. ");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("최종 Exception 입니다.");
            e.printStackTrace();
        }
//        catch (NullPointerException e) {
//            System.out.println("NullPointerException이 발생했습니다.");
//            e.printStackTrace();
//        }

    }
}
