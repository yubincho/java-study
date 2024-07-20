package supercoding.fourthweek.디자인패턴.데코레이터;

public class Coffee implements Beverage{

    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
