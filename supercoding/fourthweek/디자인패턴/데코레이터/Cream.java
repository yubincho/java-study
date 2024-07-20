package supercoding.fourthweek.디자인패턴.데코레이터;

public class Cream extends BeverageDecorator {

    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cream";
    }


    @Override
    public double cost() {
        return super.cost() + 0.6;
    }
}
