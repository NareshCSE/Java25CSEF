package mypackage5be;
abstract class AbstractShape { 
    int length = 20; 
    int breadth = 15; 
} 

class Rectangle extends AbstractShape { 
    public void printArea() { 
        System.out.println("The area of Rectangle is " + (length * breadth)); 
    } 
} 

class Triangle extends AbstractShape { 
    public void printArea() { 
        System.out.println("The area of Triangle is " + (0.5 * length * breadth)); 
    } 
} 

class Circle extends AbstractShape { 
    public void printArea() { 
        System.out.println("The area of circle is " + (2 * 3.14 * length * breadth)); 
    } 
} 

public class Shape { 
    public static void main(String[] args) { 
        Rectangle r = new Rectangle(); 
        Triangle t = new Triangle(); 
        Circle c = new Circle(); 
        r.printArea();
        t.printArea();
        c.printArea();
    } 
}
