package supercoding.secondweek.인터페이스;

public interface Flyable {

    long atmosphereLimit = 476; //대기권

    default void fly() {
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    }

    static void printLanding() {
        System.out.println("<정보> 현재 이 사물은 공중에 있습니다.");
    }
}
