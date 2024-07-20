package assignment4week_정답아님.fourthDay;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String role;

    public UserDTO(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // 게터와 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User toUser() {
        if ("admin".equalsIgnoreCase(role)) {
            return new AdminUser(name, Role.valueOfTerm(role));
        } else {
            return new User(name, Role.valueOfTerm(role));
        }
    }

}

