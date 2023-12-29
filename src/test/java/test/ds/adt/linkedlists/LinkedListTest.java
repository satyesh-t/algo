package test.ds.adt.linkedlists;

import ds.adt.linkedlists.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LinkedListTest {

    @Test
    public void testLl()
    {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        String lls=ll.toString();
        Assertions.assertEquals(lls,"[1]->[2]->null");
    }
}
