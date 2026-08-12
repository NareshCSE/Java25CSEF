package welcome;
import java.util.Scanner;
public class Patterns3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter number od sides");
		int n=input.nextInt();
	      
        int i,j,k;
        for(i=0;i<n;i++) {
        	for(j=0;j<=i;j++) {
        		System.out.print("  ");
	    }
        	 char ch='A';
	    for(k=n;k>i;k--) {
	    	 
	    	System.out.print(ch+" ");
	    	ch++;
	    }
	    System.out.println("\n");
}
}
}
