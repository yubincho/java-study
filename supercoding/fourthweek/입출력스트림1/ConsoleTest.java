package supercoding.fourthweek.입출력스트림1;

import java.io.IOException;

public class ConsoleTest {

    public static void main(String[] args) {

        int i= 0;

        System.out.println("입력값을 넣어주세요");
        try {
            StringBuilder sb = new StringBuilder();
            while((i = System.in.read()) != '\n') {
                sb.append((char) i);
            }
            System.out.println("string 출력: " + sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }








    }
}
