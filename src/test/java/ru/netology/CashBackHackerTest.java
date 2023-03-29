package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashBackHackerTest {

    @Test
    public void testRemain() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(3600);
        int expected = 400;

        assertEquals(expected,actual);
    }
    @Test
    public void testFailed() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected,actual);
    }
}