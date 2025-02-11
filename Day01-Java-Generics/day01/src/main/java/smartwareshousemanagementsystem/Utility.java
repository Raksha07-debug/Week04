package smartwareshousemanagementsystem;

import java.util.List;

public class Utility  {
    public static void displayAllItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item:items){
            item.displayInfo();
        }
    }

    }

