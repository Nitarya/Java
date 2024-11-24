abstract class Shape {
    abstract void calculateArea();

    void displayShapeType(String type) {
        System.out.println("This is a " + type + ".");
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius){

    this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is" + area);
    }
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("The are of the rectangle is:" + area);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        circle.displayShapeType("Circle");
        circle.calculateArea();

        Shape rectangle = new Rectangle(4.0, 6.0);
        rectangle.displayShapeType("Rectangle");
        rectangle.calculateArea();
    }
}


