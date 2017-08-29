package com.nayema;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {5, 7, 10, 25, 30};

        String[] stringArray = {"Shah", "Nayema", "Phil", "Bob", "John"};

        System.out.println("Original array of integers: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));

        System.out.println("Original array of Strings: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String array: " + Arrays.toString(stringArray));
    }
}
