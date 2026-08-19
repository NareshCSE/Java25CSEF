package mypackage;
import java.util.Scanner;
public class Pattern 
{
	public static void main(String[] args)
{
	System.out.println("enter the character");
	Scanner in=new Scanner(System.in);
	char ch=in.next().charAt(0);
	for(char i='A';i<=ch;i++)
	{
		for(char j=i;j<ch;j++)
		{
			System.out.print(" ");
		}
		for(char k='A';k<=i;k++)
		{
			System.out.print(k);
		}
		System.out.println();
	}
	for(int i=ch-1;i>='A';i--)
	{
		for(int j=ch-1;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(char k='A';k<=i;k++)
		{
			System.out.print(k);
		}
		System.out.println();
	}
		
}
}
