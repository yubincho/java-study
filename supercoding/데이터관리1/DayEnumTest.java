package supercoding.데이터관리1;

import java.util.Arrays;

public class DayEnumTest {

    public static void main(String[] args) {

        // 각각 Enum 값 정의
        // Ordinal, compareTo, values
        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        System.out.println(monday.ordinal());   // 1
        System.out.println(sunday.ordinal());   // 0
        System.out.println(thursday.ordinal());  // 4

        System.out.println(monday.compareTo(sunday));   // 1
        System.out.println(monday.compareTo(thursday)); // -3

        Day[] days = Day.values();
        System.out.println(Arrays.toString(days)); //[SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]



    }
}
