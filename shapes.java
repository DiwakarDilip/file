package shapes;

public class Shape {
    public void displayArea() {
        System.out.println("Area: ");
    }
}


public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Circle Area: " + calculateArea());
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void displayArea() {
        System.out.println("Rectangle Area: " + calculateArea());
    }

    public double calculateArea() {
        return length * width;
    }
}


import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
    }
}


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add(circle);
        shapesList.add(rectangle);
    }
}


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add(circle);
        shapesList.add(rectangle);

        try {
            for (Shape shape : shapesList) {
                shape.displayArea();
            }
        } catch (Exception e) {
            System.err.println("An error occurred: ");
        } finally {
            System.out.println("Calculation complete.");
        }
    }
}
