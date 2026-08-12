package mypackage5bq;
import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		        System.out.print("Enter no of rows: "); 
		        int rows = input.nextInt(); 
		        for(int i=7;i>=1;i--) {

					for(int j=1;j<=7-i;j++) {
						System.out.print(" ");
					}
				for(char ch='A';ch<'A'+i;ch++) {
					System.out.print(ch);
				}
				System.out.println();
				}
			input.close(); 
}
}




