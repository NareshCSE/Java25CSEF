package z5;

import java.util.Scanner;

public class Array1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int[] integers=new int[10];

	     for(int i=0;i<10;i++) {
	  	   System.out.println("enter number "+i);
	  	   integers[i]=scan.nextInt();}
	  	   for(int j=0;j<10;j++) {
	  		   int inst=integers[j];
	  		   for(int k=j+1;k<10;k++) {
	  			   if(inst==integers[k]) {
	  				   System.out.println(integers[k]);
	  			   }
	  		   }
	  	   
	     }
		
		
	}
	
}
