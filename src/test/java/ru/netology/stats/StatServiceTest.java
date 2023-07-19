package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {


    @Test

    public void shouldFindSum() {
        StatService service = new StatService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.salesSum(array);

        Assertions.assertEquals(expectedSum, actualSum);
        System.out.println("Сумма всех продаж за год - " + actualSum);
    }


    @Test

    public void shouldFindAverage() {
        StatService service = new StatService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSales(array);
        Assertions.assertEquals(expectedAverage, actualAverage);
        System.out.println("Средняя сумма продаж в месяц - " + actualAverage);

    }

    @Test
    public void shouldFindMinMonth() {
        StatService service = new StatService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minMonthSales(array);

        Assertions.assertEquals(expectedMonth, actualMonth);

        System.out.println("Месяц в котором был минимум продаж - " + actualMonth);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatService service = new StatService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxMonthSales(array);

        Assertions.assertEquals(expectedMonth, actualMonth);

        System.out.println("Месяц в котором был максимум продаж - " + actualMonth);
    }


    @Test
    public void shouldFindBelowAverageMonths() {
        StatService service = new StatService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.salesBelowAverage(array);

        Assertions.assertEquals(expectedMonths, actualMonths);
        System.out.println("Количество месяцев с продажами ниже среднего - " + actualMonths);


    }


    @Test
    public void shouldFindAboveAverageMonths() {
        StatService service = new StatService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.salesAboveAverage(array);

        Assertions.assertEquals(expectedMonths, actualMonths);
        System.out.println("Количество месяцев с продажами выше среднего - " + actualMonths);


    }
}




