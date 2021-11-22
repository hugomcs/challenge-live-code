package net.intelie.challenge;

import org.junit.Test;

import static net.intelie.challenge.ListUtils.createListFromInts;
import static net.intelie.challenge.ListUtils.createListWithSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {


    @Test
    public void basicTest() {
        ListNode a = createListWithSize(5);
        ListNode b = createListFromInts(5, 6, 7, 8);
        ListNode expected = createListFromInts(0, 1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(expected, Solution.mergeTwo(a, b));
    }

    @Test
    public void testMerge() {
        ListNode a = createListFromInts(1, 3, 5, 7);
        ListNode b = createListFromInts(0, 2, 4, 6, 8);
        ListNode expected = createListFromInts(0, 1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(expected, Solution.mergeTwo(a, b));
    }

    @Test
    public void testDuplicated() {
        ListNode a = createListFromInts(1, 3);
        ListNode b = createListFromInts(1, 5);
        ListNode expected = createListFromInts(1, 1, 3, 5);
        assertEquals(expected, Solution.mergeTwo(a, b));
    }

    @Test
    public void mergeWithNull() {
        ListNode a = createListFromInts(10);
        assertEquals(a, Solution.mergeTwo(a, null));
    }

    @Test
    public void mergeBothNull() {
        assertNull(Solution.mergeTwo(null, null));
    }

    @Test
    public void testFromSite() {
        ListNode a = createListFromInts(1, 2, 4);
        ListNode b = createListFromInts(1, 3, 4);
        ListNode expected = createListFromInts(1, 1, 2, 3, 4, 4);
        assertEquals(expected, Solution.mergeTwo(a, b));
    }
}