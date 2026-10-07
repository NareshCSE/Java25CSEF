package mypackage;
abstract class Shapes {
    int a, b;

    abstract void printArea();
}

class Rectangle extends Shapes {
    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}

class Triangle extends Shapes {
    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
} 

class Circle extends Shapes {
    void printArea() {
        System.out.println("Area of Circle = " + (Math.PI * a * a));
    }
}

public class Shape{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
        r.a = 10;
        r.b = 5;
        r.printArea();

        Triangle t = new Triangle();
        t.a = 10;
        t.b = 5;
        t.printArea();

        Circle c = new Circle();
        c.a = 7;
        c.printArea();
	}

}
