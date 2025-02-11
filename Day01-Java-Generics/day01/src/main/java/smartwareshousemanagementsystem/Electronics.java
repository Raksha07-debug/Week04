package smartwareshousemanagementsystem;

public class Electronics  extends WarehouseItem{

    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("\n===== Electronic Item =====");
        System.out.println("Name: " + name);  // Display the name of the item
        System.out.println("Price: " + price);  // Display the price of the item
    }
}
