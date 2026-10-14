package myproject5z4;

		import java.util.HashMap;
		import java.util.Scanner;

		public class Name {
		    public static void main(String[] args) {
		        HashMap<String, String> contacts = new HashMap<>();

		        // Load names and phone numbers
		        contacts.put("rujula", "9876543210");
		        contacts.put("medha", "9123456780");
		        contacts.put("snigdha", "9988776655");

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a name or phone number: ");
		        String input = sc.nextLine().trim();

		        boolean found = false;

		        // Search by name
		        if (contacts.containsKey(input)) {
		            System.out.println("Phone number: " + contacts.get(input));
		            found = true;
		        } else {
		            // Search by phone number
		            for (String name : contacts.keySet()) {
		                if (contacts.get(name).equals(input)) {
		                    System.out.println("Name: " + name);
		                    found = true;
		                    break;
		                }
		            }
		        }

		        if (!found) {
		            System.out.println("Contact not found.");
		        }

		        sc.close();
		    }

	}


