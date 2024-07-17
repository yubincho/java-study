package assignment4week_정답아님;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 변수 선언 및 초기화

        try {
            // 숫자1 입력
            System.out.print("숫자1 입력: ");
            int num1 = scanner.nextInt();

            // 숫자2 입력
            System.out.print("숫자2 입력: ");
            int num2 = scanner.nextInt();

            // 연산자 입력
            System.out.print("연산자 입력 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // calculate 메소드 호출
//            System.out.println(calculate(10, 2, '+'));
            int result = calculate(num1, num2, operator);

            // 결과 출력
            System.out.println("결과: " + result);

        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        }




    }

    public static int calculate(int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        // 사칙연산 수행 및 예외 처리
        if ( num2 == 0 && operator == '/') throw new DivideByZeroException("0으로 나눌 수 없습니다.");

        boolean isValidOperator = false;
        char[] operators  = {'+', '-', '*', '/'};

        for (char op : operators ) {
            if (operator == op) {
                isValidOperator = true;
                break;
            }
        }

        if (!isValidOperator) {
            throw new InvalidOperatorException("올바른 연산자를 입력해야 합니다.");
        }

        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;  // num2가 0이 아니라고 확인됨
            default:
                throw new InvalidOperatorException("올바른 연산자를 입력해야 합니다."); // 이 경우는 발생하지 않지만 추가함
        }

    }


}
