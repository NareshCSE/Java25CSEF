package myproject5bl;
abstract class Shape {
int a;
int b;
// Empty abstract method
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
public class pro13 {

	public static void main(String[] args) {
	Rectangle rectangle = new Rectangle();
	rectangle.a = 32;
	rectangle.b = 7;
	rectangle.printArea();
	Triangle triangle = new Triangle();
	triangle.a = 22;
	triangle.b = 89;
	triangle.printArea();
	Circle circle = new Circle();
	circle.a = 3;
	circle.printArea();
	}
	}

