package supercoding.여러기본클캐스;


public class StringCharArrayTest {

    public static void main(String[] args) {

        // char array 와 String 과의 관계

        char[] chars = {'a', 'b', 'c'};

        // char array -> String
        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        // String -> Char array
        char[] chars2 = str1.toCharArray();
        for(char ch : chars2) {
            System.out.println(ch);
        }

        System.out.println(str1.charAt(0)); // 인덱스 : 'a' 출력





    }
}
