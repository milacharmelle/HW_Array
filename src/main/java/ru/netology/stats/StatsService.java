package ru.netology.stats;

public class StatsService {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSalesMonNumber(long[] sales) {
        int maxSalesMonNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesMonNumber]) {
                maxSalesMonNumber = i;
            }
        }
        return maxSalesMonNumber + 1;
    }

    public int minSalesMonNumber(long[] sales) {
        int minSalesMonNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesMonNumber]) {
                minSalesMonNumber = i;
            }
        }
        return minSalesMonNumber + 1;
    }

    public int monLessAverage(long[] sales) {
        long average = average(sales);

        int monLessAverage = 0;
        for (long sale : sales) {
            if (sale < average) {
                monLessAverage++;
            }
        }

        return monLessAverage;
    }

    public int monMoreAverage(long[] sales) {

        long average = average(sales);

        int monMoreAverage = 0;
        for (long sale : sales) {
            if (sale > average) {
                monMoreAverage++;
            }
        }

        return monMoreAverage;
    }

}