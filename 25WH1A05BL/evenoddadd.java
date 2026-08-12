package myproject5bl;

import java.util.Scanner;

public class evenoddadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
        int evensum=0;
        int oddsum=0;
        // 3. Instantiate the array with the dynamic size
        int[] numbers = new int[size];
        System.out.println("enter the numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        for(int j=0;j<size;j++) {
        	if(numbers[j]%2==0) {
        		evensum=evensum+numbers[j];
        	}
        	else {
        		oddsum=oddsum+numbers[j];
        	}
        }
        System.out.println("the sum of even numbers is:"+evensum);
        System.out.println("the sum of odd numbers is:"+oddsum);
        
	}

}
