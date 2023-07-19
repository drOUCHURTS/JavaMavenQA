package ru.netology.stats;
public class StatService {

    public int salesSum(int[] sales) {

        int sum = 0;

        for (int i : sales) {
            sum = sum + i;
        }
        return sum;
    }
    public int averageSales(int[] sales) {

        double average = 0;

        if (sales.length > 0) {

            double sum = 0;

            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;

        }
        return (int) average;
    }

    public int minMonthSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int average = averageSales(sales);
        int months = 0;
        for (int sale : sales) {
            if (sale < average) {
                months = months + 1;
            }
        }
        return months;
    }

    public int salesAboveAverage(int[] sales) {
        int average = averageSales(sales);
        int months = 0;
        for (int sale : sales) {
            if (sale > average) {
                months = months +1;
            }
        }
        return months;
    }
}














