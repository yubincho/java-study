package supercoding.fourthweek.입출력스트림1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterTest {

    public static void main(String[] args) {

        String content = "이것은 파일 컨텐츠입니다.";

        try (FileWriter fos = new FileWriter("C:\\Users\\user\\Documents\\codingTest\\supercoding\\fourthweek\\입출력스트림1\\output_korean.txt", true)){
            // true : 덮어쓰기 가능

            fos.write(content);
            System.out.println("txt 파일이 생성되었습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }







    }
}
