package supercoding.fourthweek.람다식2;

import supercoding.fourthweek.람다식2.MultipleNum;

public class LambdaUseTest {

    public static void main(String[] args) {

        MultipleNum multipleNum = (num) -> num * 10;

        printNum(multipleNum);

        printNum((x) -> x * 100);

        ////////////////////////////
        GenericLambda<String> genericLambda1 = (str) -> str.toUpperCase();
        GenericLambda<Integer> genericLambda2 = (num) -> num * 2;
        GenericLambda<Boolean> genericLambda3 = (myBool) -> myBool & true;

        System.out.println(genericLambda1.calculate("abc"));
        System.out.println(genericLambda2.calculate(100));
        System.out.println(genericLambda3.calculate(false));

    }

    static void printNum(MultipleNum multipleNum) {
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }
}
