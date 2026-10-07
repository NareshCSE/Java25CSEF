package oopj_05aa;

import java.util.HashSet;
import java.util.Set;

public class Seller {
    private Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (products.add(product)) {
            System.out.println("Added: " + product.getName());
        } else {
            System.out.println("Product ID " + product.getProductId() + " is already in store.");
        }
    }

    public void showProducts() {
        System.out.println("\nAvailable Products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public Product findProduct(int productId) {
        for (Product p : products) {
            if (p.getProductId() == productId) {
                return p;
            }
        }
        return null;
    }
}