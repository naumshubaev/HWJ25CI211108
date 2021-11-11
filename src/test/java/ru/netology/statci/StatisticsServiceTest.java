package ru.netology.statci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
/* ниже лишний тест, написанный в процессе поиска
оставил, т.к. ноль - оч.полезная цифра для тестов
 */
    @Test
    void findMaxZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        long expected = 0;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxOne() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 3, 1, 5, 1, 7, 1, 9, 1, 11, 1};
        long expected = 11;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}