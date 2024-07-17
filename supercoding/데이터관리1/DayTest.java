package supercoding.데이터관리1;

public class DayTest {

    public static void main(String[] args) {

        Day monday = Day.MONDAY;
        System.out.println(monday);   // MONDAY
        System.out.println(monday.getKoreanName());  // 월요릴


        Day day = Day.TUESDAY;

        switch (day) {
            case MONDAY:
                System.out.println("한 주의 시작입니다." + day.getKoreanName());
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("오늘은 평일입니다." + day.getKoreanName());
                break;
            case FRIDAY:
                System.out.println("오늘만 지나면 주말입니다." + day.getKoreanName());
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("야호 오늘은 주말입니다." + day.getKoreanName());
                break;
        }


    }
}
