package supercoding.fourthweek.내부클래스유틸래스;

public class LocalTest {

    public static void main(String[] args) {

        class LocalWalk implements Walkable {
            @Override
            public void walk() {
                System.out.println("LocalWalk: Waking");
            }
        }

        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        int i = 100;
        // 익명 클래스
        supercoding.인터페이스.Walkable anonymousWalk = new supercoding.인터페이스.Walkable() {

            @Override
            public void walk() {
                System.out.println(i); // 접근 가능하지만 수정은 불가
                System.out.println("AnonymousWalk: Walking");
            }
        };

        anonymousWalk.walk();
    }

}
