package ru.netology.statci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 0, 0};
        long expected = 0;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxOne() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 1, 1};
        long expected = 1;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}