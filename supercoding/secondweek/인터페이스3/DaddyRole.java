package supercoding.secondweek.인터페이스3;

public interface DaddyRole {

    void educateBaby(Baby baby);

    default void sayLoveEveryDay() {
        System.out.println("우리 아기 사랑합니다~");
    }

}
