package javaprograms;

abstract class Shape {
    int a;
    int b;

    // Abstract method
    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

// Triangle class
class Triangle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

// Circle class
class Circle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * a * a));
    }
}

public class Main4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.a = 10;
        rectangle.b = 5;
        rectangle.printArea();

        Triangle triangle = new Triangle();
        triangle.a = 10;
        triangle.b = 6;
        triangle.printArea();

        Circle circle = new Circle();
        circle.a = 7; 
        circle.printArea();
    }
}
