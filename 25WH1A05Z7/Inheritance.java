package mypackage5z7;
	
class Parent{
	Parent(){
		System.out.println("this is parent def constr");
	}
	Parent(String msg){
		System.out.println("this is Parent param constr");
	}
	String property="1.5Cr"; //inst var
	double addition(double num1, double num2) {
		return num1+num2;
	}
}
class Child extends Parent{
	Child(){
		super("hello");
		System.out.println("this is Child def constr");
	}
	String property="1Cr"; // insta var
	void getBalance(){
		String property="1L"; // local var
		System.out.println(property); //1L
		System.out.println(this.property); //1Cr
		System.out.println(super.property); //1.5Cr
	}
	double division(double num1,double num2) {
		return num1/num2;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
		child.addition(123, 2345); //parent class prop
		child.division(34254,1243); //child class prop
		child.getBalance();
	}

}

class A{
	void addition() {
		
	}
	
}

class B extends A{
	void addition() {
		
	}
	
}

class C extends B{
	
}
