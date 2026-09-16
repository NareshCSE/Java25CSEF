package myproject;

import java.util.HashSet;

class Product {

    private int productId;
    private String name;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Seller {

    HashSet<Product> products = new HashSet<>();

    void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added: " + p.getName());
    }
}

class Customer {

    double total = 0;

    void placeOrder(Product p, HashSet<Product> products) {

        for (Product x : products) {

            if (x.getProductId() == p.getProductId()) {

                System.out.println("Product: " + x.getName());
                System.out.println("Price: " + x.getPrice());

                total = total + x.getPrice();

                return;
            }
        }

        System.out.println("Product not found");
    }
}

public class Ecommerce {

    public static void main(String[] args) {

        Seller seller = new Seller();

        Product p1 = new Product();
        p1.setProductId(101);
        p1.setName("Laptop");
        p1.setPrice(50000);

        Product p2 = new Product();
        p2.setProductId(102);
        p2.setName("Mobile");
        p2.setPrice(20000);

        seller.addProduct(p1);
        seller.addProduct(p2);

        Customer customer = new Customer();

        customer.placeOrder(p1, seller.products);
        customer.placeOrder(p2, seller.products);

        System.out.println("Total Price: " + customer.total);
    }
}
