package com.nayema;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {7, 2, 3, 4, 5, 6, 1, 8, 9, 10};

        System.out.println("Array: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sorted Array: " + Arrays.toString(intArray));
        System.out.println("Minimum: " + intArray[0]);
        System.out.println("Maximum: " + intArray[intArray.length - 1]);
    }
}
