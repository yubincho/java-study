package supercoding.fourthweek.입출력스트림1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        String content = "This is content of File";

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Documents\\codingTest\\supercoding\\fourthweek\\입출력스트림1\\output.txt", true)){
            // true : 덮어쓰기 가능
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("txt 파일이 생성되었습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }







    }
}
