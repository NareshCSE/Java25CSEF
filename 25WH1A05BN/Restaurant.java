package myproject;

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
    Item[] items;

    Order(int orderId, Item[] items) {
        this.orderId = orderId;
        this.items = items;
    }
}

interface Restaurant {

    void printName();

    void addItem(Item item);

    Item[] getMenu();

    void placeOrder(Order order);

    double generateBill(int orderId);
}

class KFC implements Restaurant {

    Item[] menu = new Item[10];
    int count = 0;
    Order order;

    public void printName() {
        System.out.println("Restaurant: KFC");
    }

    public void addItem(Item item) {
        menu[count] = item;
        count++;
    }

    public Item[] getMenu() {
        return menu;
    }

    public void placeOrder(Order order) {
        this.order = order;
        System.out.println("Order placed: " + order.orderId);
    }

    public double generateBill(int orderId) {

        double total = 0;

        if (order != null && order.orderId == orderId) {

            for (Item item : order.items) {
                total = total + item.price;
            }

            double tax = total * 0.06;
            double totalAmount = total + tax;

            System.out.println("Order ID: " + orderId);
            System.out.println("Amount: " + total);
            System.out.println("Tax: " + tax);
            System.out.println("Total Amount: " + totalAmount);

            return totalAmount;
        }

        System.out.println("Order not found");
        return 0;
    }
}

public class RestaurantTest {

    public static void main(String[] args) {

        KFC k = new KFC();

        k.printName();

        Item i1 = new Item(1, "Burger", 150);
        Item i2 = new Item(2, "Fries", 100);
        Item i3 = new Item(3, "Chicken", 250);

        k.addItem(i1);
        k.addItem(i2);
        k.addItem(i3);

        Item[] orderedItems = {i1, i2};

        Order o = new Order(101, orderedItems);

        k.placeOrder(o);

        k.generateBill(101);
    }
}
