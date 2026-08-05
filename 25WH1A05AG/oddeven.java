package mypackage5ag;
import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter numbers:");
		for(int i=0;i<5;i++) {
			a[i]=input.nextInt();
		}
		int sum=0,count=0;
		for(int i=0;i<5;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
			else {
				count+=a[i];
			}
		}
		System.out.println("sum of even: "+sum+"\nsum of odd: "+count);
		}
			
	}
