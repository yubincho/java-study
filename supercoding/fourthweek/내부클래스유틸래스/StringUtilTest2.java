package supercoding.fourthweek.내부클래스유틸래스;

public class StringUtilTest2 {

    public static void main(String[] args) {

        String str = "Hello World!";
        char target = 'o';

        // 1. 문자열이 비어있는지 확인
        Boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println(isEmpty);

        // 2. 문자열을 반대로 뒤집기
        String str2 = StringUtils.reverse(str);
        System.out.println(str2);

        // 3. 주어진 문자열에서 특정 문자의 개수 세기
        int countChar = StringUtils2.CharChecker.countChar(str, target);
        System.out.println(countChar);

        // 4. 주어진 문자열에 특정 문자가 있는지 확인
        Boolean isContainChar = StringUtils2.CharChecker.containChar(str, target);
        System.out.println(isContainChar);




    }
}
