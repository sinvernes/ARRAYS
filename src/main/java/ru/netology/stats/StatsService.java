package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];
        }
        return totalSale;
    }

    public long averageSales(long[] sales) {
        long averageSales = sumSales(sales) / sales.length;
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthBelowAverageSale(long[] sales) {
        int counter = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public int monthOverAverageSale(long[] sales) {
        int counter = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}