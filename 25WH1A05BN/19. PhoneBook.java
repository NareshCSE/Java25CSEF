package myproject;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Utkarsh", "9876543210");
        map.put("Priya", "9876501234");
        map.put("Anu", "9123456780");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name or phone number: ");
        String input = sc.nextLine();

        if (map.containsKey(input)) {

            System.out.println("Phone Number: " + map.get(input));

        } else {

            boolean found = false;

            for (String name : map.keySet()) {

                if (map.get(name).equals(input)) {
                    System.out.println("Name: " + name);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Not found");
            }
        }
    }
}
