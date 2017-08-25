package com.nayema;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int[] copyArray = new int[7];

        System.out.println("Given Array: " + Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            copyArray[i] = intArray[i];
        }

        System.out.println("Copied Array: " + Arrays.toString(copyArray));
    }
}
