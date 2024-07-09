package ClassAndObject;

public class Rectangle {

    public double length;
    public double breadth;

    public Rectangle() {
        System.out.println("Non parameterized constructor");
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return (length * breadth);
    }

    public double getPerimeter() {
        return ((length + breadth) * 2);
    }
}
