package com.nayema;

import java.util.Arrays;

public class ArraysAssistant {

    public static boolean contains(int[] items, int item) {
        for (int a : items) {
            if (item == a) {
                return true;
            }
        }
        return false;
    }

    public static int findIndex(int[] items, int item) {
        for (int i = 0; i < items.length; i++) {
            if (item == items[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int addValues(int[] items) {
        int sum = 0;
        for (int a : items) {
            sum += a;
        }
        return sum;
    }

    public static int calculateAverage(int[] items) {
        int sum = 0;
        for (int a : items) {
            sum += a;
        }
        return sum / items.length;
    }

    public static int caculateMedian(int[] items) {
        sortArrays(items);
        int median;
        if (items.length % 2 == 0) {
            int centeredNumber1 = (items.length - 1) / 2;
            int centeredNumber2 = (items.length) / 2;

            median = (items[centeredNumber1] + items[centeredNumber2]) / 2;
        } else {
            int centeredNumber = (items.length - 1) / 2;

            median = items[centeredNumber];
        }
        return median;
    }

    public static int[] sortArrays(int[] items) {
        int temp;
        for (int i = 0; i < items.length; i++) {
            for (int j = 1; j < items.length - 1; j++) {

                if (items[j - 1] > items[j]) {
                    temp = items[j - 1];
                    items[j - 1] = items[j];
                    items[j] = temp;
                }
            }
        }

        return items;
    }
}
