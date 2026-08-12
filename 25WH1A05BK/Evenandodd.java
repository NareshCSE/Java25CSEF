package myproject5bk;

import java.util.Scanner;

public class Evenandodd {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int sz=input.nextInt();
		int evensum=0;
		int oddsum=0;
		int[] numbers=new int[sz];
		System.out.println("enter the numbers");
		for(int i=0;i<sz;i++) {
			numbers[i]=input.nextInt();
		}for( int j=0;j<sz;j++) {
			if(numbers[j]%2==0) {
				evensum=evensum+numbers[j];
				}
			else {
				oddsum=oddsum+numbers[j];
			}

   }
		System.out.println("sum of even numbers:"+evensum);
		System.out.println("sum of odd numbers:"+oddsum);
		
	    }
	}

