package supercoding.fourthweek.디자인패턴.전략;

public class StrategyTest {

    public static void main(String[] args) {

        DiscountCalculator calculator = new DiscountCalculator();

        // 신규 가입자 확인
        calculator.setDiscountStrategy(new NewCustomerDiscountStrategy());;
        double discount1 = calculator.calculateDiscount(10000);
        System.out.println("신규 가입자 할인 금액: " + discount1);

        calculator.setDiscountStrategy(new SeasonDiscountStrategy());
        double discount2 = calculator.calculateDiscount(10000);
        System.out.println("시즌 할인 가입자 할인 금액: " + discount2);

        calculator.setDiscountStrategy(new ReferenceFriendDiscountStrategy());
        double discount3 = calculator.calculateDiscount(10000);
        System.out.println("친구 할인 가입자 할인 금액: " + discount3);



    }
}
