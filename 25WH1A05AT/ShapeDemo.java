package mypackage5at;

import java.util.Scanner;

abstract class Shape {
    int a, b;

    abstract void printArea();
}
class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}

class Triangle extends Shape {

    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
}

class Circle extends Shape {

    Circle(int radius) {
        a = radius;
    }

    void printArea() {
        System.out.println("Area of Circle = " + (Math.PI * a * a));
    }
}

public class ShapeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        Rectangle rectangle = new Rectangle(length, breadth);

        System.out.print("Enter base of triangle: ");
        int base = sc.nextInt();

        System.out.print("Enter height of triangle: ");
        int height = sc.nextInt();

        Triangle triangle = new Triangle(base, height);

        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();

        Circle circle = new Circle(radius);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();

        sc.close();
    }
}
