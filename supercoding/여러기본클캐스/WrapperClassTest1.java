package supercoding.여러기본클캐스;

public class WrapperClassTest1 {

    public static void main(String[] rags) {

//        Integer num = new Integer(17); // 박싱
//        int n = num.intValue();  // 언박싱

        Integer num2 = 17;  // 오토 박싱 ( Integer 객체로 변환됩니다.)

        int n2 = num2;  // 오토 언박싱 , int n2 = num2.intValue();

        System.out.println(n2);


//        Character ch1 = new Character('X');  // 박싱
//        char c1 = ch1.charValue();  // 언박싱

        Character ch2 = 'X';  // 오토 박싱 Character ch = new Character('X');
        char c2 = ch2;  // 오토 언박싱 , char c2 = ch.charValue();

        System.out.println(c2);

    }
}
