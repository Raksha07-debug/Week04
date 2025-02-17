package junit;

import java.util.ArrayList;
import java.util.List;

public class ListOperation {
    public static  void addElemement(List<Integer> list, int element){
        if(list!=null){
            list.add(element);
            System.out.println("element added: "+element);
        }
    }
    public static void removeElement(List<Integer> list, int element) {
        if (list != null) {
            list.remove(Integer.valueOf(element));
            System.out.println("element removed: "+element);

        }
    }
    public static int size(List<Integer> list ){
        return list.size();
    }


    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
       addElemement(list,15);
       addElemement(list,7);
       addElemement(list,13);
       addElemement(list,9);
       removeElement(list,15);
        System.out.println("size of list "+size(list));


    }
}
