package supercoding.secondweek.인터페이스3;

public interface HusbandRole {

    void takeCareWife(Wife wife);

    default void sayLoveEveryDay() {
        System.out.println("우리 아내 사랑합니다~");
    }

    String getName();
}
