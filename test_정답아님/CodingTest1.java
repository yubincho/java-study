package test_정답아님;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CodingTest1 {


    public static String solution() {



        return null;
    }

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
//        LocalDate startDate = LocalDate.parse("2021.05.02", formatter);
//        int daysToAdd = 6 * 28;
//        LocalDate endDate = startDate.plusDays(daysToAdd);
//        System.out.println("6개월 후 날짜: " + endDate.format(formatter));


        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        String[] terms = {"A 6", "B 12", "C 3"};

        LocalDate today = LocalDate.parse("2022.05.19", formatter);

        int daysToAdd;
        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String datePrivacy = parts[1];
            System.out.println(datePrivacy);
            LocalDate startDate = LocalDate.parse(parts[0], formatter);

            for (int j = 0; j < terms.length; j++) {
                String[] termParts = terms[j].split(" ");
                String termType = termParts[0];
                long addDate = Integer.parseInt(termParts[1]) * 28L;
                if(termType.equals(datePrivacy)) {
                    LocalDate endDate = startDate.plusDays(addDate);

                    if(today.isAfter(endDate)) {
                        result.add(privacies[i]);
                    }
                }


            }
        }

        System.out.println(result);
        for (String item : result) {
            int index = 0; // 만약 항목을 찾지 못할 경우를 대비해 초기값을 -1로 설정
            for (int i = 0; i < privacies.length; i++) {
                if (privacies[i].equals(item)) {
                    index = i + 1;
                    break; // 항목을 찾았으니 더 이상 검색하지 않고 반복문 종료
                }
            }
            System.out.println(index);
        }


    }
}
