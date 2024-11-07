package Lab._02_Shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double sideA, double sideB) {
        this.height = sideA;
        this.width = sideB;
        calculatePerimeter();
        calculateArea();
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = (height * width);
        super.setPerimeter(perimeter);
    }

    @Override
    public void calculateArea() {
        double area = height * width;
        super.setArea(area);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
