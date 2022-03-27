package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void ZeroCashbackHackService () {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void LessThousandCashbackHackService () {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void ThousandCashbackHackService () {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void MoreThousandCashbackHackService () {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

}