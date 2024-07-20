package supercoding.fourthweek.디자인패턴.전략;

public class DiscountCalculator {

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        if (discountStrategy != null) {
            return discountStrategy.calculateDiscount(amount);
        }
        else {
            return 0;  // 할인 없음
        }
    }

}
