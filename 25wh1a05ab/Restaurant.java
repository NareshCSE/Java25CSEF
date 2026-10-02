package javaprograms;

// Restaurant interface
interface Restaurant {
    // Normal/default method
    default void printRestaurantName() {
        System.out.println("Restaurant Name: KFC");
    }

    // Abstract methods
    void addItem(Item item);
    Item[] getMenu();
    Order placeOrder(int orderId, Item[] items);
    double generateBill(int orderId);
}

// Item Bean Class
class Item {
    private int itemId;
    private String itemName;
    private double price;

    public Item(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemId() { return itemId; }
    public void setItemId(int itemId) { this.itemId = itemId; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

// Order Bean Class
class Order {
    private int orderId;
    private Item[] items;

    public Order(int orderId, Item[] items) {
        this.orderId = orderId;
        this.items = items;
    }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public Item[] getItems() { return items; }
    public void setItems(Item[] items) { this.items = items; }
}

// KFC Implementation Class
class KFC implements Restaurant {
    private Item[] menu = new Item[10];
    private int menuCount = 0;

    private Order[] orders = new Order[10];
    private int orderCount = 0;

    // Add item to menu
    @Override
    public void addItem(Item item) {
        if (menuCount < menu.length) {
            menu[menuCount] = item;
            menuCount++;
            System.out.println(item.getItemName() + " added to KFC menu.");
        } else {
            System.out.println("Menu is full.");
        }
    }

    // Return menu
    @Override
    public Item[] getMenu() {
        return menu;
    }

    // Place order
    @Override
    public Order placeOrder(int orderId, Item[] items) {
        Order order = new Order(orderId, items);
        if (orderCount < orders.length) {
            orders[orderCount] = order;
            orderCount++;
            System.out.println("Order placed successfully!");
            System.out.println("Order ID: " + orderId);
        }
        return order;
    }

    // Generate bill with 6% tax
    @Override
    public double generateBill(int orderId) {
        Order selectedOrder = null;
        // Find order
        for (int i = 0; i < orderCount; i++) {
            if (orders[i].getOrderId() == orderId) {
                selectedOrder = orders[i];
                break;
            }
        }

        if (selectedOrder == null) {
            System.out.println("Order not found.");
            return 0;
        }

        double totalAmount = 0;
        // Calculate item total
        for (Item item : selectedOrder.getItems()) {
            totalAmount += item.getPrice();
        }

        // Calculate 6% tax
        double tax = totalAmount * 0.06;
        double finalAmount = totalAmount + tax;

        System.out.println("\n========== KFC BILL ==========");
        System.out.println("Order ID       : " + orderId);
        System.out.println("Item Total     : ₹" + totalAmount);
        System.out.println("Tax (6%)       : ₹" + tax);
        System.out.println("Total Amount   : ₹" + finalAmount);
        System.out.println("==============================");

        return finalAmount;
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Late binding
        Restaurant restaurant = new KFC();

        // Print restaurant name
        restaurant.printRestaurantName();

        // Create Items
        Item item1 = new Item(101, "Chicken Bucket", 500);
        Item item2 = new Item(102, "Chicken Burger", 200);
        Item item3 = new Item(103, "French Fries", 150);

        // Add items to menu
        restaurant.addItem(item1);
        restaurant.addItem(item2);
        restaurant.addItem(item3);

        // Display menu
        System.out.println("\n========== KFC MENU ==========");
        Item[] menu = restaurant.getMenu();
        for (Item item : menu) {
            if (item != null) {
                System.out.println(
                    item.getItemId() + " - " +
                    item.getItemName() + " - ₹" +
                    item.getPrice()
                );
            }
        }

        // Create order
        Item[] orderedItems = {item1, item2, item3};
        restaurant.placeOrder(1001, orderedItems);

        // Generate bill
        double total = restaurant.generateBill(1001);
        System.out.println("\nFinal Amount: ₹" + total);
    }
}
