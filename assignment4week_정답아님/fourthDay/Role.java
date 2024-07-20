package assignment4week_정답아님.fourthDay;

public enum Role {

    USER("user"),
    ADMIN("admin");

    private String roleTerm;

    Role(String roleTerm) {
        this.roleTerm = roleTerm;
    }

    public static Role valueOfTerm(String roleStr) {
        for (Role role : Role.values()) {
            if (roleStr.equals(role.roleTerm)) {
                return role;
            }
        }
        throw new IllegalArgumentException("No role with text: " + roleStr + " found");
    }
}
