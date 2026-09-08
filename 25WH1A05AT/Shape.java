import java.util.Scanner;

// Abstract class
abstract class Shape {
    int a, b;

    abstract void printArea();

    // Main method inside Shape
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter Rectangle Length: ");
        int length = sc.nextInt();

        System.out.print("Enter Rectangle Breadth: ");
        int breadth = sc.nextInt();

        Shape r = new Rectangle(length, breadth);

        // Triangle
        System.out.print("Enter Triangle Base: ");
        int base = sc.nextInt();

        System.out.print("Enter Triangle Height: ");
        int height = sc.nextInt();

        Shape t = new Triangle(base, height);

        // Circle
        System.out.print("Enter Circle Radius: ");
        int radius = sc.nextInt();

        Shape c = new Circle(radius);

        System.out.println("\nAreas are:");
        r.printArea();
        t.printArea();
        c.printArea();

        sc.close();
    }
}

// Rectangle class
class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}

// Triangle class
class Triangle extends Shape {

    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (a * b / 2.0));
    }
}

// Circle class
class Circle extends Shape {

    Circle(int radius) {
        a = radius;
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * a * a));
    }
}
