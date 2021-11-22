package net.intelie.challenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void testKMerge() {
        ListNode a = ListUtils.createListFromInts(1, 2, 3);
        ListNode b = ListUtils.createListFromInts(4, 5, 6);
        ListNode c = ListUtils.createListFromInts(1, 5, 8);
        ListNode expected = ListUtils.createListFromInts(1, 1, 2, 3, 4, 5, 5, 6, 8);
        assertEquals(expected, Solution.mergeK(a, b, c));
    }

    @Test
    public void testKMerge2() {
        ListNode a = ListUtils.createListFromInts(1, 2, 3);
        ListNode b = ListUtils.createListFromInts(4, 5, 6);
        ListNode c = ListUtils.createListFromInts(1, 5, 8);
        ListNode d = ListUtils.createListFromInts(9, 10, 11);
        ListNode expected = ListUtils.createListFromInts(1, 1, 2, 3, 4, 5, 5, 6, 8, 9, 10, 11);
        assertEquals(expected, Solution.mergeK(a, b, c, d));
    }
}
