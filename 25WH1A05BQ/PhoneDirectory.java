package mypackage5bq;

	import java.util.HashMap;
	import java.util.Scanner;

	public class PhoneDirectory {
	    public static void main(String[] args) {

	        HashMap<String, String> phoneBook = new HashMap<>();

	        phoneBook.put("Rahul", "9876543210");

	        phoneBook.put("Priya", "9123456780");

	        phoneBook.put("Arjun", "9988776655");

	        phoneBook.put("Sneha", "9090909090");

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter name or phone number: ");

	        String input = sc.nextLine();

	        if (phoneBook.containsKey(input)) {

	            System.out.println("Phone Number: " + phoneBook.get(input));

	        } else {

	            boolean found = false;

	            for (String name : phoneBook.keySet()) {

	                if (phoneBook.get(name).equals(input)) {

	                    System.out.println("Name: " + name);

	                    found = true;

	                    break;

	                }

	            }
	            if (!found) {

	                System.out.println("No matching record found.");

	            }

	        }

	        sc.close();

	    }

	}

