package com.nayema;

public class BubbleSort {

    public void sortArray(int[] array) {
        int length = array.length;
        int temp;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - 1); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
