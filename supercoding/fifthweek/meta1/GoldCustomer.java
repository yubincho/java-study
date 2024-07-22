package supercoding.fifthweek.meta1;

public class GoldCustomer extends Customer{

    double discountRatio;

    public GoldCustomer (String name) {
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusRatio = 0.03;
        this.discountRatio = 0.03;
    }

    @Override
    public int calculatePrice(int price) {
        price -= price * discountRatio;
        this.bonusPoint += price * bonusRatio;
        return price;
    }
}
