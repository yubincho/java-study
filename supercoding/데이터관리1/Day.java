package supercoding.데이터관리1;

public enum Day {
    SUNDAY("일요일"),
    MONDAY("월요릴"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일");  // 마지막 끝날땐 ","를 붙여야 한다.

    private final String koreanName;

    Day(String koreanName) {
        this.koreanName = koreanName;
    }

    public String getKoreanName() {
        return koreanName;
    }
}
