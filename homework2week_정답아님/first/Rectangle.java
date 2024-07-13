package homework2week_정답아님.first;

public class Rectangle extends Shape {

    private double width;
    private double height;


    public Rectangle(double width, double height) {
        // TODO
        super(2);
        this.width = width;
        this.height = height;
    }


    // 직사각형 면적
    @Override
    public double calculateArea() {
        // TODO
        return this.width * this.height * 0.5;
    }

    // 직사각형 둘레길이
    @Override
    public double calculatePerimeter() {
        return (this.width + this.height) * 2;
    }

    // 직사각형 대각선 길이
    public double calculateDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
