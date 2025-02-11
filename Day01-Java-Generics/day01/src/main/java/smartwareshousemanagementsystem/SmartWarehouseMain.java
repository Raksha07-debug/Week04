package smartwareshousemanagementsystem;

public class SmartWarehouseMain {
    public static void main(String[] args) {
        Electronics pc= new Electronics("mac",52369.2);
        Grocery  fig= new Grocery("fig" ,52.3);
        Furniture couch= new Furniture("sofa",7365);

        Storage <Electronics> electronicsStorage= new Storage<>();
        Storage <Grocery> groceryStorage=new Storage<>();
        Storage <Furniture> furnitureStorage=new Storage<>();

        electronicsStorage.addItem(pc);
        groceryStorage.addItem(fig);
        furnitureStorage.addItem(couch);

        Utility.displayAllItems(electronicsStorage.getItems());
        Utility.displayAllItems(electronicsStorage.getItems());
        Utility.displayAllItems(furnitureStorage.getItems());
    }
}
