package assignment4week_정답아님.secondDay;

public class OrderItem {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;

    public OrderItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

}