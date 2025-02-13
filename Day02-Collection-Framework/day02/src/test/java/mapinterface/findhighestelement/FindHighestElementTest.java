package mapinterface.findhighestelement;

import mapinterface.findkthhighestelement.FindHighestElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindHighestElementTest {
    @Test
    void findkthElement(){
        Map<String, Integer> map = new HashMap<>(Map.of("A", 10, "B", 20, "C", 15));

        Assertions.assertEquals("B", FindHighestElement.findKey(map));
    }
}
