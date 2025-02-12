package setinterface.intersectionandunionofset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

public class IntersectionAndUnionSet {
    HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
    HashSet<Integer> set2= new HashSet<>(List.of( 3,4,5));

    //testing for intersection of two set
    @Test
    void intersectionTest(){
        HashSet<Integer> output=new HashSet<>(List.of(3));
        Assertions.assertEquals(output,IntersectionAndUnion.intersectionOfSet(set1,set2));


    }
    //testing for  union of two set
    @Test
    void unionTest(){
        HashSet<Integer> output= new HashSet<>(List.of(1,2,3,4,5));
        Assertions.assertEquals(output,IntersectionAndUnion.unionOfSet(set1,set2));
    }
}
