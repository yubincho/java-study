package supercoding.예외처리1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest3 {

    public static void main(String[] args) {

        try {
            FileInputStream fs = new FileInputStream("C:\\Users\\user\\Documents\\codingTest\\supercoding\\예외처리1\\연습.txt");
            int i;
            while((i=fs.read()) != -1) {
                System.out.write(i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제가 발생하였습니다.");
            e.printStackTrace();
        }

    }
}
