package welcome;
import java.util.Scanner;
public class PATTERNS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("enter side value");
        int n=input.nextInt();
      
        int i,j,k;
        for(i=0;i<n;i++) {
       	for(j=0;j<=n-i;j++) {
        		System.out.print("  ");
	    }
	    for(k=0;k<=i;k++) {
	    	 
	    	System.out.print("* ");
	    }
	    System.out.println("\n");
}
}
}
                                 
