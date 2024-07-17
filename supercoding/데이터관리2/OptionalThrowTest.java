package supercoding.데이터관리2;

import java.util.Optional;

public class OptionalThrowTest {

    public static void main(String[] args) {

        String str = "abc";
        Optional<String> stringOptional = Optional.ofNullable(str);

//        int length = stringOptional
//                .orElseThrow(() -> { throw new CustomException("CustomException이 발생하였습니다.");})
//                .length();

        // 람다식
        int length = stringOptional
                .orElseThrow(() -> new CustomException("CustomException이 발생하였습니다."))
                .length();

        System.out.println(length);

    }
}
