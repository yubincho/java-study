package supercoding.fourthweek.디자인패턴.전략;

public class SeasonDiscountStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.1 ;
    }
}
