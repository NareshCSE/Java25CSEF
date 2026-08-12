package myproject;

	import java.util.Scanner;

	public class Palindrome {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String original = sc.nextLine();
	        
	        // Remove spaces and convert to lower-case for uniform comparison
	        String cleanStr = original.replaceAll("\\s+", "").toLowerCase();
	        String reversed = "";
	        
	        // Loop backwards through the string to build the reversed version
	        for (int i = cleanStr.length() - 1; i >= 0; i--) {
	            reversed += cleanStr.charAt(i);
	        }
	        
	        // Check if the original processed string matches the reversed string
	        if (cleanStr.equals(reversed)) {
	            System.out.println("\"" + original + "\" is a Palindrome.");
	        } else {
	            System.out.println("\"" + original + "\" is NOT a Palindrome.");
	        }
	        
	        sc.close();
	    }
	}
