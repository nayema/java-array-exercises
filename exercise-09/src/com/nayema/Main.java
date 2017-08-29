package com.nayema;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            intArray[i] = Integer.parseInt(args[i]);
        }

        printArray(intArray);

        BubbleSort sort = new BubbleSort();
        sort.sortArray(intArray);
        sort.printSortedArray(intArray);

        System.out.println("Minimum: " + getMin(intArray));
        System.out.println("Maximum: " + getMax(intArray));
    }

    private static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
