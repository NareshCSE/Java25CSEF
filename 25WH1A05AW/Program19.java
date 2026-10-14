//Write a Java program that loads names and phone numbers. 
//It takes a name or phone number as input and prints the 
//corresponding other value from the hash table (hint: use HashMap).
package mypackage5aw;
import java.util.HashMap;
import java.util.Scanner;
public class Program19{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Rahul", "9876543210");
        map.put("Priya", "9123456780");
        map.put("Amit", "9988776655");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name or phone number:");
        String input = sc.nextLine();
        if (map.containsKey(input)) {
            System.out.println(map.get(input));
        } else {
            for (String name : map.keySet()) {
                if (map.get(name).equals(input)) {
                    System.out.println(name);
                    return;
                }
            }
            System.out.println("Not found");
        }
        sc.close();
    }
}
