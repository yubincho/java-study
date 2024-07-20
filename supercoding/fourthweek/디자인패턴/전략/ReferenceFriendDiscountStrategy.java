package supercoding.fourthweek.디자인패턴.전략;


// 친구 추
public class ReferenceFriendDiscountStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
