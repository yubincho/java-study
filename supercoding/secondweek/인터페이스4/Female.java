package supercoding.secondweek.인터페이스4;

public class Female implements EmployeeRole, Wife {

    private String name;
    private int age;
    private String job;


    public Female(String name) {
        this.name = name;
    }


    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 하고 있습니다");
    }

    @Override
    public void takeCareHusband(HusbandRole husband) {
        String name = husband.getName();
        System.out.println(name + "인 남편을 케어해줍니다");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
