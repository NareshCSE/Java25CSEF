package oopj_05aa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John", "9876543210");
        phoneBook.put("Bob", "9123456789");
        phoneBook.put("Shira", "9988776655");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name or Phone Number: ");
        String input = sc.nextLine().trim();

        boolean found = false;

        if (phoneBook.containsKey(input)) {
            System.out.println("Phone Number: " + phoneBook.get(input));
            found = true;
        } else {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(input)) {
                    System.out.println("Name: " + entry.getKey());
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Record not found.");
        }

        sc.close();
    }
}