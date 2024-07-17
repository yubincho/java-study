package assignment4week_정답아님.secondDay;

public enum Gender {

    FEMALE("female"),
    MALE("male");

    private String lowerString;

    Gender(String lowerString) {
        this.lowerString = lowerString;
    }

    public static Gender valueOfTerm(String str) {
        for (Gender gen : values()) {
            if (str.equals(gen.lowerString)) {
                return gen;
            }
        }
        return null;
    }
}
