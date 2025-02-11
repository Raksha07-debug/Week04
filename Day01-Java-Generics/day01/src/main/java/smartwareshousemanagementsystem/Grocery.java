package smartwareshousemanagementsystem;

public class Grocery  extends WarehouseItem{
    Grocery(String name , double price){
        super(name,price);
    }

    @Override
    public void displayInfo() {
        System.out.println("\n===== Groceries Item =====");
        System.out.println("Name: " + name);  // Display the name of the item
        System.out.println("Price: " + price);  // Display the price of the item
    }
    }


