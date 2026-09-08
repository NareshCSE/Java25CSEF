package myproject;

import java.util.Scanner;

public class Common {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	                String[] a = {"Apple", "Banana", "Mango", "Orange"};
	                String[] b = {"Mango", "Grapes", "Apple", "Kiwi"};

	                System.out.println("Common elements:");

	                for(int i=0; i<a.length; i++) {
	                    for(int j=0; j<b.length; j++) {
	                        if(a[i].equals(b[j])) {
	                            System.out.println(a[i]);
	                            break;
	                        }
	                    }
	                }
	            }
	        }
