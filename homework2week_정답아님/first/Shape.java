package homework2week_정답아님.first;

public abstract class Shape {

    protected String color;
    protected int dimention;


    protected Shape (int dimention) {
        this.dimention = dimention;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 면적
    public double calculateArea() {
        return 0.0;
    }

    // 둘레
    public double calculatePerimeter() {
        return 0.0;
    }

    public int getDimension() {
        return this.dimention;
    }
}
