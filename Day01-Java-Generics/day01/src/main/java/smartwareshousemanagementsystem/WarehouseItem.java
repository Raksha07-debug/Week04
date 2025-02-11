package smartwareshousemanagementsystem;

abstract  public class WarehouseItem {
    String name;
    double price;

    WarehouseItem(String name,double price){
        this.name=name;
        this.price=price;
    }
    public  String getName(){
        return name;
    }
    public double getPrice(){
        return price;

    }
    abstract public void  displayInfo();

}
