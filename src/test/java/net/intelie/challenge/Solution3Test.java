package net.intelie.challenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {
    @Test
    public void name() {
        ListNode a = ListUtils.createListFromInts(42, 123, 1, 2, 3);
        ListNode expected = ListUtils.createListFromInts(1, 2, 3, 42, 123);
        assertEquals(expected, Solution.sort(a));
    }
}
