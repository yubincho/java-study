package supercoding.예외처리1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

    public static void main(String[] args) throws FileNotFoundException {
//        makeUncheckedException();
        makeCheckedException();
    }

    public static void makeUncheckedException() {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 10;

        System.out.println("값: " + intArr[index]);

    }

    public static void makeCheckedException() throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Documents\\codingTest\\supercoding\\예외처리1\\연습.txt");
        FileInputStream fs = new FileInputStream(file);

        System.out.println("FS 실행됩니다.");
    }



}
