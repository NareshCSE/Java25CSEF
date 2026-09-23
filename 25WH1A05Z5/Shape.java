package z5;

abstract class Shape {
    int a;
    int b;
    abstract void printArea(int a, int b);
}

class Rectangle extends Shape {
    @Override
    void printArea(int a, int b) {
        System.out.println("the area of rectangle is   "+a * b);
    }
}

class Triangle extends Shape {
    @Override
    void printArea(int a, int b) {
        System.out.println("the area of triangle is    "+0.5 * a * b);
    }
}

class Circle extends Shape {
    @Override
    void printArea(int a, int b) {
        System.out.println("the area of circle is     "+3.14 * a * a);
    }
}

public class Program13 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.printArea(2, 4);
        Triangle t=new Triangle();
        t.printArea(7,9);
        Circle c=new Circle();
        c.printArea(3, 9);	
    }
}
