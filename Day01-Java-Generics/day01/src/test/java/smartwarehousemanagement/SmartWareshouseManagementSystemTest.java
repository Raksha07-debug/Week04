package smartwarehousemanagement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smartwareshousemanagementsystem.*;

import java.util.List;

public class SmartWareshouseManagementSystemTest {
    @Test
    void testElectroncs(){
        Electronics pc= new Electronics("mac",52369.2);
        Assertions.assertEquals("mac",pc.getName());
        pc.displayInfo();;

    }
    @Test
    void testGrocery(){
        Grocery fig=new Grocery("fig",75);
        Assertions.assertEquals("fig",fig.getName());
        fig.displayInfo();
    }
   void testFurniture(){
       Furniture sofa= new Furniture("sofa",450000);
       Assertions.assertEquals("sofa",sofa.getName());
       sofa.displayInfo();
   }

   @Test
    void testStorage(){
       Storage<Electronics> electronicsStorage= new Storage<>();
       Electronics laptop= new Electronics("mac",75333);
       electronicsStorage.addItem(laptop);
       List<Electronics> electronicItems=electronicsStorage.getItems();
       Assertions.assertEquals(1,electronicItems.size());
    }
    void testUtility(){
        // Create instances of Storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics laptop = new Electronics("Asus Laptop", 72999.99);
        electronicsStorage.addItem(laptop);

        Storage<Grocery> groceriesStorage = new Storage<>();
        Grocery apple = new Grocery("Apple", 99.99);
        groceriesStorage.addItem(apple);

        Storage<Furniture> furnitureStorage = new Storage<>();
        Furniture chair = new Furniture("Gaming Chair", 7999.99);
        furnitureStorage.addItem(chair);

        // Display all items in each storage category
        Utility.displayAllItems(electronicsStorage.getItems());
        Utility.displayAllItems(groceriesStorage.getItems());
        Utility.displayAllItems(furnitureStorage.getItems());
    }

}
