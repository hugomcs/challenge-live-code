package net.intelie.challenge;

import org.junit.Before;
import org.junit.Test;

import static net.intelie.challenge.ListUtils.createListWithSize;
import static net.intelie.challenge.ListUtils.listSize;
import static org.junit.Assert.assertEquals;

public class ListNodeTest {

    ListNode small;
    ListNode mid;
    ListNode huge;

    @Before
    public void setUp() {
        small = createListWithSize(5);
        mid = createListWithSize(10);
        huge = createListWithSize(15);
    }

    @Test
    public void basicTest() {
        assertEquals(5, listSize(small));
        assertEquals(10, listSize(mid));
        assertEquals(15, listSize(huge));
    }

    @Test
    public void testToString() {
        assertEquals("0->1->2->3->4", small.toString());
        assertEquals("0->1->2->3->4->5->6->7->8->9", mid.toString());
        assertEquals("0->1->2->3->4->5->6->7->8->9...", huge.toString());
    }

    @Test
    public void testHashcode() {
        assertEquals(5115, small.hashCode());
        assertEquals(11005, mid.hashCode());
        assertEquals(17670, huge.hashCode());
    }
}