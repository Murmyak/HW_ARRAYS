package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testCalculateTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateTotalSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // Последний месяц с максимальными продажами — это август (7-й индекс + 1)
        int actual = service.maxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9; // Последний месяц с минимальными продажами — это сентябрь (8-й индекс + 1)
        int actual = service.minSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowAverageSalesCount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // 5 месяцев с продажами ниже среднего
        int actual = service.belowAverageSalesCount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveAverageSalesCount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // 5 месяцев с продажами выше среднего
        int actual = service.aboveAverageSalesCount(sales);
        Assertions.assertEquals(expected, actual);
    }
}