package mypackage;
import java.util.Scanner;
class pal
{
	int check(int a,int b,String s)
	{
		while(a<b)
		{
			if(s.charAt(a)!=s.charAt(b))
				return 0;
			a++;
			b--;
		}
		return 1;
	}
}
public class Palindrome 
{
	public static void main(String[]args)
	{
	System.out.println("enter the string");
	Scanner in=new Scanner(System.in);
	String s=in.next();
	int a=0;
	int b=s.length()-1;
	pal obj=new pal();
	if(obj.check(a,b,s)==1)
		System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
	
	
	}
	
}
