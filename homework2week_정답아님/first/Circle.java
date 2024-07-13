package homework2week_정답아님.first;

public class Circle extends Shape {

    private static final double PI = 3.14;
    private double radius;
//    private String color;

    public Circle(double radius) {
        super(2);
        this.radius = radius;
    }

    // 원 면적
    @Override
    public double calculateArea() {
        //TODO
        return this.radius * this.radius * PI;
    }

    // 원 둘레
    @Override
    public double calculatePerimeter() {
        return 2 * PI * this.radius;
    }

    // 원 지름
    public double calculateDiameter() {
        return this.radius += this.radius;
    }


    public double getRadius() {
        return radius;
    }


}
