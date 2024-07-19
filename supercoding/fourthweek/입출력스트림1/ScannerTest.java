package supercoding.fourthweek.입출력스트림1;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 입력해주세요");
        String name = scanner.nextLine();

        System.out.println("직업 입력해주세요");
        String job = scanner.nextLine();

        System.out.println("나이를 입력해주세요");
        int age = scanner.nextInt();

        System.out.println(name + job + age);





    }
}
