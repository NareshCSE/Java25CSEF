package mypackage5bq;
import java.util.Scanner;
public class CommonEle {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter size of first array: ");
		 int n1 = sc.nextInt();
		 sc.nextLine();
		 String[] arr1 = new String[n1];
	  System.out.println("Enter elements of first array:");
		 for (int i = 0; i < n1; i++) {
		      arr1[i] = sc.next();
		 }
		 System.out.print("Enter size of second array: ");
		 int n2 = sc.nextInt();
		 sc.nextLine();
		 String[] arr2 = new String[n2];
		 System.out.println("Enter elements of second array:");
		 for (int i = 0; i < n2; i++) {
		     arr2[i] = sc.next();
		 }
		 System.out.println("Common elements:");
		 for (int i = 0; i < arr1.length; i++) {
		     for (int j = 0; j < arr2.length; j++) {
		         if (arr1[i].equals(arr2[j])) {
		            System.out.println(arr1[i]);
		            break;
		         }
		     }
		 }
		 sc.close();
     }
}
