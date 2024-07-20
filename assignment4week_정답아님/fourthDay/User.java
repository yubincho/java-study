package assignment4week_정답아님.fourthDay;

public class User {

    protected String name;

    protected Role role;

    public User(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
