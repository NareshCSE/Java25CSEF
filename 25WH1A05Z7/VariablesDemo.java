package mypackage5z7;

public class VariablesDemo {
	int number1=1000;  //instance/non static variable
	int number6=4000;
	static int number2=2000; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number3=3000;  //local variable
		VariablesDemo obj1=new  VariablesDemo(); //creation of object
		VariablesDemo obj2=new  VariablesDemo(); //creation of object
		obj1.number1=5000;
		System.out.println(obj1.number1); // 5000
		System.out.println(obj2.number1); // 1000
		
		int result=obj1.addition(456,879);
		System.out.println("the sum is:"+result);
		
		System.out.println(number2);
		System.out.println(obj2.number2);
		System.out.println(VariablesDemo.number2);
		obj1.number2=6000;
		System.out.println(obj1.number2);
		System.out.println(obj2.number2);
		
		System.out.println("the division is:"+division(2600, 570));

	}
	int addition(int number4, int number5) {
		int sum=number4+number5;  // local variables num4,num5,sum
		return sum;

	}
	
	static double division(double number5, double number6) {
		double result = number5/number6;
		return result;
	}

}
