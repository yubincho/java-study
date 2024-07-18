package supercoding.secondweek.인터페이스3;

public class InterfaceTest {

    public static void main(String[] args) {

        // male = 남편, 아빠, 회사원
        HusbandRole male = new Male("철수");
        Wife wife = new Female("아이유");

        male.sayLoveEveryDay();
        male.takeCareWife(wife);

        // 이어서 아빠 그대로..
        DaddyRole male2 = (DaddyRole) male;
        Baby baby = new Baby("정우성");

        male2.educateBaby(baby);
        male2.sayLoveEveryDay();

        // 회사원으로..
        EmployeeRole maleEmployee = (EmployeeRole) male2;
        EmployeeRole femaleEmployee = new Female("김채원");

        maleEmployee.workTogether(femaleEmployee);




    }
}
