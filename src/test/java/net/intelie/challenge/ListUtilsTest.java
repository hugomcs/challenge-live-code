package net.intelie.challenge;

import org.junit.Test;

import static net.intelie.challenge.ListUtils.createListFromInts;
import static org.junit.Assert.assertEquals;

public class ListUtilsTest {
    @Test
    public void listFromInts() {
        assertEquals("150->42->1", createListFromInts(150, 42, 1).toString());
        assertEquals("150->1->42", createListFromInts(150, 1, 42).toString());
    }
}