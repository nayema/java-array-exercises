package com.nayema;

import java.util.Arrays;

public class Main {

    public static int printMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int printMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array: " + Arrays.toString(intArray));
        System.out.println("Minimum: " + printMin(intArray));
        System.out.println("Maximum: " + printMax(intArray));
    }
}
