package supercoding.fourthweek.람다식2;

import supercoding.fourthweek.데이터관리2.CustomException;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {

    public static void main(String[] args) {

        String str = null;
//        String str = "abc";

        Optional<String> stringOptional = Optional.ofNullable(str);

        // 방법1
//        Supplier<String> stringSupplier = () -> "default";
//        String str2 = stringOptional.orElseGet(stringSupplier)
//                .toUpperCase();

        // 방법 2
//        String str2 = stringOptional.orElseGet(() -> "default")
//                        .toUpperCase();

        // 방법 3
        String str2 = stringOptional.orElseThrow(() -> { throw new CustomException("customException 입니다."); })
                        .toUpperCase();

        System.out.println(str2);

    }
}
