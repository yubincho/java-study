package supercoding.fourthweek.디자인패턴.데코레이터;

public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }


    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
