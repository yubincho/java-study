package assignment4week_정답아님.secondDay;

public class Customer {
    private String name;
    private int age;
    private Gender gender;

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = Gender.valueOfTerm(gender);

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
