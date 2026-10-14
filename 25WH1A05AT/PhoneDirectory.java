package myproject5at;
import java.util.Scanner;
import java.util.HashMap;

public class PhoneDirectory {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>contacts=new HashMap<>();
		
		contacts.put("Shreeya","1234567890");
		contacts.put("Manashwini","9876543210");
		contacts.put("Himaja","5647382901");
		contacts.put("Himani","2029384675");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name or phone number");
		String input=sc.nextLine().trim();
		
		boolean found= false;
		if(contacts.containsKey(input)) {
			System.out.println("Phone Number:" + contacts.get(input));
			found = true;
		}else {
			for (String name : contacts.keySet()) {
				if(contacts.get(name).equals(input)) {
					System.out.println("Name:" + name);
					found=true;
					break;
				}
			}
		}
		
		if(!found) {
		System.out.println("No matching record found!");	
		}
		sc.close();

	}

}
