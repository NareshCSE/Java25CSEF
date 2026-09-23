package myproject5bc;

import java.util.Scanner;

abstract class shapes {
    int len;
    int wid;
    int rad;
    int base;
    int height;
    abstract void printArea();
}

class rectangle extends shapes {
    void printArea() {
        int area = (len * wid);
        System.out.println("Area of Rectangle:" + area);
    }
}

class triangle extends shapes {
    void printArea() {
        double area = ((0.5) * base * height);
        System.out.println("Area of Triangle:" + area);
    }
}

class circle extends shapes {
    void printArea() {
        double area = ((3.14) * rad * rad);
        System.out.println("Area of Circle:" + area);
    }
}
public class shapes13 {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in); 
    	
    	System.out.println("Enter length:");
    	int len=input.nextInt();
    	System.out.println("Enter width:");
    	int wid=input.nextInt();
    	System.out.println("Enter radius:");
    	int rad=input.nextInt();
    	System.out.println("Enter Base:");
    	int base=input.nextInt();
    	System.out.println("Enter Height:");
    	int height=input.nextInt();
    	
    	input.close();
    	
        rectangle r = new rectangle();
        r.len=len;
        r.wid=wid;
        triangle t = new triangle();
        t.base=base;
        t.height=height;
        circle c = new circle();
        c.rad=rad;
        
        r.printArea();
        t.printArea();
        c.printArea();
    }
}
