package com.nayema;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Array: " + Arrays.toString(numbers));

        int[] sortedArray = ArraysAssistant.sortArrays(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        System.out.println("Length of the array: " + numbers.length);

        boolean contains7 = ArraysAssistant.contains(numbers, 7);
        System.out.println("Contains number 7 in the array: " + contains7);

        int index = ArraysAssistant.findIndex(numbers, 7);
        System.out.println("The index of number 7 in the array is: " + index);
        if (index == -1) {
            System.out.println(" --> This number is not in the given array");
        }

        int sum = ArraysAssistant.addValues(numbers);
        System.out.println("Sum: " + sum);

        int mean = ArraysAssistant.calculateAverage(numbers);
        System.out.println("Mean: " + mean);

        int median = ArraysAssistant.caculateMedian(numbers);
        System.out.println("Median: " + median);
    }
}
