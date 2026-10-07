package oopj_05aa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECommerce{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Seller seller = new Seller();

        seller.addProduct(new Product(101, "Laptop", 850.00));
        seller.addProduct(new Product(102, "Smartphone", 500.00));
        seller.addProduct(new Product(103, "Headphones", 50.00));
        seller.addProduct(new Product(104, "Mouse", 25.00));

        seller.showProducts();

        List<Product> cart = new ArrayList<>();
        double total = 0.0;

        System.out.println("\nEnter Product ID to buy (enter 0 to finish):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();

            if (id == 0) {
                break;
            }

            Product item = seller.findProduct(id);

            if (item != null) {
                cart.add(item);
                total += item.getPrice();
                System.out.println("Added " + item.getName() + " to cart.");
            } else {
                System.out.println("Invalid Product ID.");
            }
        }

        System.out.println("\n--- Order Summary ---");
        if (cart.isEmpty()) {
            System.out.println("No items bought.");
        } else {
            for (Product p : cart) {
                System.out.println(p.getName() + " - $" + p.getPrice());
            }
            System.out.println("Total Amount: $" + total);
        }

        sc.close();
    }
}