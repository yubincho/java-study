package supercoding.secondweek.인터페이스4;

public interface FamilyRole extends DaddyRole, HusbandRole{


    @Override
    default void sayLoveEveryDay() {
        DaddyRole.super.sayLoveEveryDay();
        HusbandRole.super.sayLoveEveryDay();
    }
}
