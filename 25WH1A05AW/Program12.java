package mypackage5aw;
class Item {
	    String name;
	    double price;
	    Item(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	}
class Order {
	    int orderId;
	    Item item;
	    int quantity;
	    Order(int orderId, Item item, int quantity) {
	        this.orderId = orderId;
	        this.item = item;
	        this.quantity = quantity;
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
 Item[] menu = new Item[5];
	    int count = 0;
	    Order order;
	    public void printName() {
	        System.out.println("Restaurant: KFC");
	    }
	    public void addItem(Item item) {
	        menu[count] = item;
	        count++;
	        System.out.println("Item added successfully");
	    }
	    public Item[] getMenu() {
	        return menu;
	    }
	    public void placeOrder(Order order) {
	        this.order = order;
	        System.out.println("Order placed successfully");
	    }
	    public double generateBill(int orderId) {
	        double amount = order.item.price * order.quantity;
	        return amount + (amount * 0.06);
	    }
	}
	public class Program12 {
	    public static void main(String[] args) {
	        KFC kfc = new KFC();
	        kfc.printName();
	        Item item = new Item("Burger", 100);
	        kfc.addItem(item);
	        Order order = new Order(101, item, 2);
	        kfc.placeOrder(order);
	        System.out.println("Total Bill = " + kfc.generateBill(101));
	    }
	}

