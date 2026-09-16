package myproject5z4;

import java.util.Scanner;

public class Shape {
 public static void main(String[] args) {
     
     Rectangle rect = new Rectangle();
     Triangle tri = new Triangle();
     Circle circ = new Circle();

     rect.printArea();
     tri.printArea();
     circ.printArea();
 }
}
abstract class Shapes {
 public int val1; 
 public int val2;
 abstract void printArea();
}
class Rectangle extends Shapes {
 @Override
 void printArea() {
     Scanner input = new Scanner(System.in);
     System.out.println("\n--- Area of Rectangle ---");
     System.out.print("Enter length: ");
     val1 = input.nextInt();
     System.out.print("Enter breadth: ");
     val2 = input.nextInt();
     
     int area = val1 * val2;
     System.out.println("The area of Rectangle is: " + area);
 }
}
class Triangle extends Shapes {
 @Override
 void printArea() {
     Scanner input = new Scanner(System.in);
     System.out.println("\n--- Area of Triangle ---");
     System.out.print("Enter base: ");
     val1 = input.nextInt();
     System.out.print("Enter height: ");
     val2 = input.nextInt();
     
     double area = 0.5 * val1 * val2;
     System.out.println("The area of Triangle is: " + area);
 }
}
class Circle extends Shapes {
 @Override
 void printArea() {
     Scanner input = new Scanner(System.in);
     System.out.println("\n--- Area of Circle ---");
     System.out.print("Enter radius: ");
     val1 = input.nextInt(); 
     
     double area = 3.14159 * val1 * val1;
     System.out.println("The area of Circle is: " + area);
 }
}
