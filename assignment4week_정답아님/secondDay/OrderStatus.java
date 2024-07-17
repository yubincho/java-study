package assignment4week_정답아님.secondDay;

public enum OrderStatus {

    PAID("PAID"),
    SHIPPED("SHIPPED"),
    DELIVERED("DELIVERED"),
    ONORDER("ON ORDER"),
    NOTPAID("NOT PAID");

    private String englishTerm;

    OrderStatus(String englishTerm) {
        this.englishTerm = englishTerm;
    }

    public static OrderStatus valueOfTerm(String str) {
        for (OrderStatus status : values()) {
            if (str.equals(status.englishTerm)) {
                return status;
            }
        }
        return null;
    }
}
