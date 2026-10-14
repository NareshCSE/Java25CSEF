package z5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
	public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
      
        phoneBook.put("John", "9898989898");
        phoneBook.put("Smith", "9797979797");
        phoneBook.put("Sia","9696969696");
        phoneBook.put("Alice", "9595959595");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name or phone number to search: ");
        String input = scanner.nextLine().trim();
        boolean found = false;

        if (phoneBook.containsKey(input)) {
            String phoneNumber = phoneBook.get(input);
            System.out.println("Match found. Name:"+input+" -> Phone:"+phoneNumber+"");
            found = true;
        }
        else {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(input)) {
                    System.out.println("Match found! Phone:"+input+" -> Name:"+entry.getKey());
                    found = true;
                    break; 
                }
            }
        }
	if(!found) {
		System.out.println("No matching name or phone.no found");
	}
	scanner.close();

	}
}
