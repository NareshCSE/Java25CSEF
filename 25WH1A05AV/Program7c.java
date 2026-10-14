package mypackage;
import java.util.Scanner;
public class Program7c {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] a = new String[3];
	        String[] b = new String[3];
	        System.out.println("Enter first array:");
	        for (int i = 0; i < 3; i++) {
	            a[i] = sc.next();
	        }
	        System.out.println("Enter second array:");
	        for (int i = 0; i < 3; i++) {
	            b[i] = sc.next();
	        }
	        System.out.println("Common elements:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (a[i].equals(b[j])) {
	                    System.out.println(a[i]);
	                }
	            }
	        }
	    }
	}