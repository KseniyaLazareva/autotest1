package org.example;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void actionAmountOneThousandFiveHundred() {
        CashbackHackService cb = new CashbackHackService();
        int actual = cb.remain(1500);
        int expected = 500;
        assertEquals(actual, expected);
    }
    @Test
    public void actionAmountOneThousand() {
        CashbackHackService cb = new CashbackHackService();
        int actual = cb.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void actionAmountNineHundredAndNinetyNine() {
        CashbackHackService cb = new CashbackHackService();
        int actual = cb.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }


}