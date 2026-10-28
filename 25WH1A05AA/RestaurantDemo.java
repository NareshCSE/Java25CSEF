package oopj_05aa;

import java.util.ArrayList;
import java.util.Scanner;

class Item {
    int id;
    String name;
    double price;

    Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    ArrayList<Item> items = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }
}

interface Restaurant {
    void printName();
    void addItem(Item item);
    ArrayList<Item> getMenu();
    void placeOrder(Order order);
    double generateBill(int orderId);
}

class KFC implements Restaurant {
    ArrayList<Item> menu = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();

    public void printName() {
        System.out.println("Restaurant: KFC");
    }

    public void addItem(Item item) {
        menu.add(item);
    }

    public ArrayList<Item> getMenu() {
        return menu;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order placed successfully.");
    }

    public double generateBill(int orderId) {
        double total = 0;

        for (Order order : orders) {
            if (order.orderId == orderId) {
                for (Item item : order.items) {
                    total += item.price;
                }

                return total + total * 0.06;
            }
        }

        System.out.println("Order not found.");
        return 0;
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        KFC kfc = new KFC();

        kfc.printName();

        kfc.addItem(new Item(1, "Burger", 150));
        kfc.addItem(new Item(2, "Pizza", 250));
        kfc.addItem(new Item(3, "Fries", 100));

        System.out.println("\nMenu:");
        for (Item item : kfc.getMenu()) {
            System.out.println(item.id + " " + item.name + " Rs." + item.price);
        }

        Scanner sc = new Scanner(System.in);
        Order order = new Order(101);

        System.out.print("\nEnter item ID to order (0 to finish): ");

        while (true) {
            int id = sc.nextInt();

            if (id == 0) {
                break;
            }

            boolean found = false;

            for (Item item : kfc.getMenu()) {
                if (item.id == id) {
                    order.items.add(item);
                    found = true;
                    System.out.println(item.name + " added.");
                    break;
                }
            }

            if (!found) {
                System.out.println("Invalid item ID.");
            }

            System.out.print("Enter next item ID (0 to finish): ");
        }

        kfc.placeOrder(order);

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Total bill with 6% tax: Rs."
                + kfc.generateBill(order.orderId));

        sc.close();
    }
}