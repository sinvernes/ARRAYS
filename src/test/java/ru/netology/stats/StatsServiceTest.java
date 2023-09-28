package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test

    public void testSumSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.sumSales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.averageSales(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMaxMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMinMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthBelowAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.monthBelowAverageSale(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthOverAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.monthBelowAverageSale(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}