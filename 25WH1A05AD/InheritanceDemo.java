package mypackage5ad;
class Parent{
	Parent()
	{
		System.out.println("this is parent def constr");
	}
	Parent(String msg)
	{
		System.out.println("this is parent param constr");
	}

	String property="1.5Cr";//INST VAR
	double add(double num1,double num2)
	{
		return num1+num2;
	}
}
class Child extends Parent{
	String property="1Cr";//INST VAR
	Child()
	{
		System.out.println("this is child def constr");
	}

	void getBalance()
	{
		String property ="1L";//LOCAL
		System.out.println(property);   //1l
		System.out.println(this.property); //1cr(from same class inst var)
		System.out.println(super.property); //1.5cr(from parent class)
	}
	double div(double num1,double num2)
	{
		return num1/num2;
	}

}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child child=new Child();
        Parent parent=new Parent();
        System.out.println(child.add(123,2345));
    	System.out.println(child.div(34254,1243));
    	child.getBalance(); 
	}

}
