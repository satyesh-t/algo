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

    @Test
    public void testRemove()
    {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        String lls=ll.toString();
        Assertions.assertEquals(lls,"[1]->[2]->[3]->null");
        ll.remove(2);
        Assertions.assertEquals(lls,"[1]->[3]->null");
        ll.remove(3);
        Assertions.assertEquals(lls,"[1]->null");

    }
}
