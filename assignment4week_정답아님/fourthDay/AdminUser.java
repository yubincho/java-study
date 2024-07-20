package assignment4week_정답아님.fourthDay;

public class AdminUser extends User {


    public AdminUser(String name, Role role) {
        super(name, role);
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
