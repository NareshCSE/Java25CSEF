package z5;
import java.util.Scanner;
public class array2 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int[][] mat1=new int[3][3];	
		int[][] mat2=new int[3][3];
		int[][] c=new int[3][3];
		  for(int i=0;i<3;i++) {
			  for(int j=0;j<3;j++) {
		  	   System.out.println("enter number ");
		  	   mat1[i][j]=scan.nextInt();}
		  }	
		  for(int i=0;i<3;i++) {
			  for(int j=0;j<3;j++) {
		  	   System.out.println("enter number ");
		  	   mat2[i][j]=scan.nextInt();}
		  }	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					c[i][j]+=mat1[i][k]+mat2[k][j];
				}
			
			}
		}
		for(int i=0;i<3;i++) {
			  for(int j=0;j<3;j++) {
		  	   System.out.print(c[i][j] +" ");
			  }
			  System.out.println();
		  }		
		
		
		
	}
}
