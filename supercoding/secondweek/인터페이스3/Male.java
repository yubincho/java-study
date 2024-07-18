package supercoding.secondweek.인터페이스3;

public class Male implements HusbandRole, DaddyRole, EmployeeRole {

    private String name;
    private int age;
    private String job;


    public Male(String name) {
        this.name = name;
    }

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + "아기를 교육하고 있습니다");
    }

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 하고 있습니다");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name + "인 아내를 성심성의껏 케어합니다.");
    }

    @Override
    public void sayLoveEveryDay() {
        HusbandRole.super.sayLoveEveryDay();
        DaddyRole.super.sayLoveEveryDay();
    }

}
