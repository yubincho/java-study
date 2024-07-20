package supercoding.fourthweek.디자인패턴.데코레이터;

public abstract class BeverageDecorator implements Beverage {

    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }


    @Override
    public double cost() {
        return beverage.cost();
    }

}
