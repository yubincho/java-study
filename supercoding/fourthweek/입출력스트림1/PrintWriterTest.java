package supercoding.fourthweek.입출력스트림1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

    public static void main(String[] args) {

        // 기존 FileWriter
        String filename = "C:\\Users\\user\\Documents\\codingTest\\supercoding\\fourthweek\\입출력스트림1\\print.txt";

        try(FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write("FileWriter를 사용한 예시입니다.\n");

            int number = 42;
            String formattedNumber = String.format("이 메서드는 형식화된 문자열을 출력합니다. 숫자: %d\n", number);
            fileWriter.write(formattedNumber);

            double value = 3.14;
            String formattedValue = String.format("format()도 형식화된 문자열을 출력합니다. 값: %.2f\n", value);
            fileWriter.write(formattedValue);

        } catch (IOException e) {
            System.out.println("파일을 쓰는 도중 오류가 발생했습니다." + e.getMessage());
        }


        // PrintWriter 적용 : 성능은 이전과 동일, 하지만 코드 사용성 개선

        String filename2 = "C:\\Users\\user\\Documents\\codingTest\\supercoding\\fourthweek\\입출력스트림1\\print2.txt";

        try(PrintWriter printWriter = new PrintWriter(new FileWriter(filename2))) {
            printWriter.println("FileWriter를 사용한 예시입니다.");

            int number = 42;
            printWriter.printf("이 메서드는 형식화된 문자열을 출력합니다. 숫자: %d\n", number);

            double value = 3.14;
            printWriter.printf("format()도 형식화된 문자열을 출력합니다. 값: %.2f\n", value);

        } catch (IOException e) {
            System.out.println("파일을 쓰는 도중 오류가 발생했습니다." + e.getMessage());
        }



    }
}
