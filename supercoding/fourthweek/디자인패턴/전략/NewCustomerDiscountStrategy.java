package supercoding.fourthweek.디자인패턴.전략;

public class NewCustomerDiscountStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.2;  // 20% 할인
    }
}
