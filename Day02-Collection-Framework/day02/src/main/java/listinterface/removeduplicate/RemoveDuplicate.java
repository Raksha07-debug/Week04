package listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        System.out.println(result(list));
    }
    public static HashSet<Integer> result(List<Integer> list){
        HashSet<Integer> set= new LinkedHashSet<>(list);
        return set;
    }
}
