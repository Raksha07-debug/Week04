package mapinterface.findkthhighestelement;

import java.util.HashMap;
import java.util.Map;

public class FindHighestElement {
    public static String  findKey(Map<String,Integer> map){
        String keyMax=null;
        int max=Integer.MIN_VALUE;
        for(Map.Entry<String ,Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                keyMax= entry.getKey();
                max=entry.getValue();
            }
        }
        return keyMax;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Find and print the key with the highest value
        String result = findKey(map);
        System.out.println("Highest element key in  hashmap is: " +result);

    }
}
