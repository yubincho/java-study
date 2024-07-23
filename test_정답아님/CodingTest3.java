package test_정답아님;

import java.util.ArrayList;
import java.util.List;

public class CodingTest3 {

    public static void main(String[] args) {

        String randomStr = "banana";
        int length = randomStr.length();

        List<Integer> updatedNumArr = new ArrayList<>(length);

        // 리스트 업데이트: 각 문자의 이전 위치를 확인하고, 가장 가까운 위치를 리스트에 설정
        for (int i = 0; i < randomStr.length(); i++) {
            int value = -1; // 초기값을 -1로 설정
            for (int j = i - 1; j >= 0; j--) {
                if (randomStr.charAt(i) == randomStr.charAt(j)) {
                    value = i - j;
                    break; // 가장 가까운 위치를 찾으면 루프 종료
                }
            }
            updatedNumArr.add(value);
        }

        System.out.println("Updated list: " + updatedNumArr);




    }
}
