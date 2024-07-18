package supercoding.fourthweek.데이터관리2;

import java.util.Optional;

public class OptionDefaultTest {

    public static void main(String[] args) {

        String str = null;
        Optional<String> optionalS = Optional.ofNullable(str);

        int length = optionalS.orElseGet(() -> "")
                .length();

        System.out.println(length);
    }
    
    // null 일때 0으로 출력됨
    // orElseGet : null 일때 기본값(빈 string : "")을 취함
}
