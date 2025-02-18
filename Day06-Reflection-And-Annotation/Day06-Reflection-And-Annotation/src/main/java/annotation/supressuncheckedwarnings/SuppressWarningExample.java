package annotation.supressuncheckedwarnings;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List myList = new ArrayList();
            myList.add("raksha");
            myList.add(5);
            myList.add("sd");
        System.out.println(myList);
    }
}
