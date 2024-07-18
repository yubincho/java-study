package supercoding.인터페이스4;

public class MaleTwo extends FamilyMan implements FamilyRole, EmployeeRole {

    // constructor
    public MaleTwo(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 하고 있습니다");
    }
}
