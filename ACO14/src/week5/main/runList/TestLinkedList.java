package week5.main.runList;

import org.junit.Assert;
import org.junit.Test;
import week5.main.list.MyArrayList;
import week5.main.list.MyLinkedList;

import java.util.Iterator;

/**
 * Created by Agryzkov on 01.09.2016.
 */
public class TestLinkedList {

    @Test
    public void testInsertionWillGrow() {
        MyLinkedList<String> ml = new MyLinkedList<>();
        ml.add("");
        ml.add("");
        for (int i = 0; i < 100; i++) {
            Assert.assertTrue(ml.add("Test"));
        }
    }

    @Test
    public void testClassicIteration() {
        final MyLinkedList<String> ml = new MyLinkedList<String>();
        ml.add("");
        ml.add("");
        ml.add("");
        final Iterator<String> iter = ml.iterator();
        int items = 0;
        while (iter.hasNext()) {
            iter.next();
            items++;
        }
        Assert.assertEquals(3, items);
    }

    @Test
    public void testAddingAfterRemoval() {
        final MyLinkedList<String> ml = new MyLinkedList<String>();
        ml.add("a");
        ml.add("b");
        ml.remove(1);
        ml.remove(0);
        ml.add("c");
        Assert.assertEquals("c", ml.get(0));
    }
}
