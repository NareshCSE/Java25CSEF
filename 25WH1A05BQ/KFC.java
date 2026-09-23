package mypckage5BQ;
import java.util.Scanner;
interface Restaurant {
    String getName();
    Item[] addItem(Item item[]);
    Item[] getMenu();
    Order placeorder(String table_name, Item[] menu);
    double generateBill(Order order);
}
class Item {
    private int Item_id;
    private String Item_name;
    private double price;
    public Item(int item_id, String item_name, double price) {
        super();
        Item_id = item_id;
        Item_name = item_name;
        this.price = price;
    }
    public int getItem_id() {
        return Item_id;
    }
    public String getItem_name() {
     return Item_name;
    }
    public double getPrice() {
        return price;
    }
}
class Order {
    private int Order_id;
    private Item[] selectItems;
    private String table_name;
    public Order(String table_name, Item[] selectItems) {
        super();
        this.selectItems = selectItems;
        this.table_name = table_name;
    }
    public int getOrder_id() {
        return Order_id;

    }
    public Item[] getSelectItems() {
        return selectItems;
    }
    public String getTable_name() {
        return table_name;
    }
}
public class KFC implements Restaurant {
    Item item[] = new Item[10];
    @Override
    public String getName() {
        return "KFC";
    }
    @Override
    public Item[] addItem(Item item[]) {
        this.item = item;
        return this.item;
    }
    @Override
    public Item[] getMenu() {
        return item;
    }
    @Override
    public Order placeorder(String table_name, Item[] items) {
        Order order = new Order(table_name, items);
        return order;
    }
    @Override
    public double generateBill(Order order) {
        Item[] items = order.getSelectItems();
        double bill = 0;
        System.out.println("\n----- ORDER DETAILS -----");
        for (Item item : items) {
            if (item != null) {
                System.out.println(
                    item.getItem_name() + "\t" + item.getPrice()
                );
                bill += item.getPrice();
            }
        }
        System.out.println("-------------------------");
        System.out.println("Food Bill = " + bill);
        double tax = bill * 0.06;
        System.out.println("Tax (6%) = " + tax);
        return bill + tax;
    }
    public static void main(String[] args) {
        Restaurant kfc = new KFC();
        Scanner scan = new Scanner(System.in);
        // Enter menu
        System.out.println("Enter number of items");
        int no_of_items = scan.nextInt();
        Item menu[] = new Item[no_of_items];
        // Add menu items
        for (int i = 0; i < no_of_items; i++) {
            System.out.println("\nEnter item id");
            int item_id = scan.nextInt();
            System.out.println("Enter item price");
            double item_price = scan.nextDouble();
            System.out.println("Enter item name");
            String item_name = scan.next();
            Item item = new Item(item_id, item_name, item_price);
            menu[i] = item;
        }
        // Add items to KFC

        kfc.addItem(menu);
        System.out.println("\n======================");
        System.out.println("     WELCOME TO KFC");
        System.out.println("======================");
        // Display menu
        System.out.println("\n----- MENU -----");
        for (Item item : kfc.getMenu()) {
            System.out.println(

                item.getItem_id() + "\t" +

                item.getItem_name() + "\t" +

                item.getPrice()

            );
        }
        // Select number of items

        System.out.println("\nSelect number of items you want");
        int number = scan.nextInt();
        Item[] selectedItems = new Item[number];
        // Select items using item ID

        for (int i = 0; i < number; i++) {
            System.out.println("Select item id");
            int selectedId = scan.nextInt();
            boolean found = false;
            for (Item item : menu) {
                if (item.getItem_id() == selectedId) {
                    selectedItems[i] = item;
                    found = true;
                    break;
                }
            }
            if (!found) {

                System.out.println("Item not found!");

                i--;
            }
        }
        // Place order
        Order order = kfc.placeorder("table202", selectedItems);
        // Generate bill
        double bill = kfc.generateBill(order);
        System.out.println("Total Bill = " + bill);
        System.out.println("\nThank you for visiting KFC!");
        scan.close();
    }
}




