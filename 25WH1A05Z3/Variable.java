package mypackage5z3;

public class Variable{


	int number1=1000;

	static int number2=2000;



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int number3=3000;

		Variable obj1=new Variable();
		Variable obj2=new Variable();

		obj1.number1=5000;

		System.out.println(obj1.number1);

		System.out.println(obj2.number1);

		

		int result=obj1.addition(456,879);

		System.out.println(result);



	}

	int addition(int number4, int number5) {

		int sum=number4+number5;

		return sum;

	}



}
