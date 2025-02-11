package smartwareshousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage  <T extends  WarehouseItem>{

    List<T> items;
    public Storage(){
        items= new ArrayList<>();
    }
    public void addItem(T item){
        items.add(item);
    }
    public List <T> getItems(){
        return items;
    }

    }

