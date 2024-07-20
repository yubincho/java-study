package supercoding.fourthweek.디자인패턴.데코레이터;

public class Sugar extends BeverageDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }


    @Override
    public double cost() {
        return super.cost() + 0.3;
    }
}
