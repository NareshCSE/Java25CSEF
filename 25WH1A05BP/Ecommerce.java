package mypackagebp;

import java.util.HashSet;
import java.util.Scanner;

class ProductBean {
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

public class Ecommerce {

    public static void main(String[] args) {
        HashSet<ProductBean> products = new HashSet<>();

        ProductBean p1 = new ProductBean();
        p1.setProductId(101);
        p1.setName("Laptop");
        p1.setPrice(50000);
        products.add(p1);

        ProductBean p2 = new ProductBean();
        p2.setProductId(102);
        p2.setName("Mobile");
        p2.setPrice(20000);
        products.add(p2);

        ProductBean p3 = new ProductBean();
        p3.setProductId(103);
        p3.setName("Headphones");
        p3.setPrice(1500);
        products.add(p3);

        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.println("Available Products:");
        for (ProductBean p : products) {
            System.out.println(p.getProductId() + " "
                    + p.getName() + " Rs." + p.getPrice());
        }

        System.out.print("Enter Product ID to order: ");
        int id = sc.nextInt();

        boolean found = false;

        for (ProductBean p : products) {
            if (p.getProductId() == id) {
                System.out.println("Product ID: " + p.getProductId());
                System.out.println("Name: " + p.getName());
                System.out.println("Price: Rs." + p.getPrice());

                total += p.getPrice();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Total Price: Rs." + total);
        } else {
            System.out.println("Product not found!");
        }

        sc.close();
    }
}
