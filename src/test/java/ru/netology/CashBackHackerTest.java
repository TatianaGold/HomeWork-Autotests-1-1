package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @Test
    public void testRemain() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(2000);
        int expected = 1000;

        assertEquals(actual,expected);
    }
    @Test
    public void testFailed() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);
    }

}