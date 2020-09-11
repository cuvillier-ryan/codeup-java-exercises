package shapes;

public class Circle {
    private double radius;

    //set radius using setter method
    public Circle(double radius) {
        this.radius = radius;
    }

    //getting radius using getter method
    public double getRadius() {
        return radius;
    }

    //getting area using getter method
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    //getting circumference using getter method
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}