package smartwareshousemanagementsystem;

public class Furniture extends WarehouseItem {
    public Furniture(String name, double price){
        super(name,price);
    }

    @Override
    public void displayInfo() {
        System.out.println("\n===== Furniture Item =====");
        System.out.println("Name: " + name);  // Display the name of the item
        System.out.println("Price: " + price);  // Display the price of the item

    }
}
