package supercoding.fourthweek.디자인패턴.데코레이터;

public class OrderCoffee {

    public static void main(String[] args) {

        // 현재 Milk 추가
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + ": $" + coffee.cost());

        Beverage coffeeWithMilk = new Milk(coffee);
        System.out.println(coffeeWithMilk.getDescription() + ": $" + coffeeWithMilk.cost());

        Beverage coffeeWithMilkWithSugar = new Sugar(coffeeWithMilk);
        System.out.println(coffeeWithMilkWithSugar.getDescription() + ": $" + coffeeWithMilkWithSugar.cost());

        Beverage coffeeWithMilkWithCream = new Milk(new Cream(new Coffee()));
        System.out.println(coffeeWithMilkWithCream.getDescription() + ": $" + coffeeWithMilkWithCream.cost());

    }
}
