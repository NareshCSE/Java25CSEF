package mypackage5ad;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 obj1=new Array1();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n=input.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
		 arr[i] =input.nextInt();
		}
		System.out.println("Duplicate values:");
		for(int i=0;i<n;i++)
		{
			int inst=arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]==inst)
				{	System.out.println(inst);
				    break;}
			}
			}
		}

	}
