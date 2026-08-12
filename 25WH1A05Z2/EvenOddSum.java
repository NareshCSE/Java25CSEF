package mypackage5z2;
import java.util.Scanner;
public class EvenOddSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    int evenSum=0;
	int oddSum=0;
	System.out.println("ENTER NO OF DIGITS");
	int totalNumbers=scanner.nextInt();
	for(int i=1;i<totalNumbers;i++)
	{
		System.out.println("Enter int"+(i+1)+":");
		int temp=scanner.nextInt();
		if(temp%2==0) {
			evenSum +=temp;
			oddSum +=temp;
		}
	}
	System.out.println("Sum of even digits:" + evenSum);
	System.out.println("Sum of odd digits:" + oddSum);
	scanner.close();

}
}
