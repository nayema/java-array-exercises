package com.nayema;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original array: " + Arrays.toString(intArray));

        int removeIndex = 1;

        for (int i = removeIndex; i < intArray.length - 1; i++) {
            intArray[i] = intArray[i + 1];
        }

        System.out.println("Array after removing the second element: " + Arrays.toString(intArray));
    }
}
