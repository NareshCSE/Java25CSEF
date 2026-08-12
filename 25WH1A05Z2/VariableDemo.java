package mypackage5z2;

public class VariableDemo {
	int number1=1000;
	static int number2=2000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number3=3000;
		VariableDemo obj1=new VariableDemo();//creation of obj
		VariableDemo obj2=new VariableDemo();
		obj1.number1=5000;
		System.out.println(obj1.number1);//5000
		System.out.println(obj2.number1);//1000
        int result=obj1.addition(1333,567);//1900
        System.out.println(result);
        //we can directly access static variables without object
       System.out.println(number2);//2000
       System.out.println(obj2.number2);//we can access the static variables by these 3 way
       System.out.println(VariableDemo.number2);//with class name,highly recommended
       obj1.number2=6000;
       System.out.println(obj1.number2);
       System.out.println(obj2.number2);
       System.out.println(division(2600, 570));
	}
	int addition(int number4, int number5)
	{
		int sum=number4+number5;
		return sum;
		
	}
	static double division(double number5, double number6) {
		double result=number5/number6;
		return result;
	}

}
