package myproject;

import java.util.Scanner;

public class ArrayDuplicates {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter size: ");
	        int n = input.nextInt();

	        int[] a = new int[n];

	        System.out.println("Enter elements:");
	        for(int i = 0; i < n; i++)
	            a[i] = input.nextInt();

	        System.out.println("Duplicate values:");

	        for(int i = 0; i < n; i++) {
	            for(int j = i + 1; j < n; j++) {
	                if(a[i] == a[j]) {
	                    System.out.println(a[i]);
	                    break;
	                }
	            }
	        }
	    }
	}
