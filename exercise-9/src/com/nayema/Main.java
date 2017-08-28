package com.nayema;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {7, 2, 3, 4, 5, 6, 1, 8, 9, 10};

        System.out.print("Array: ");
        printArray(intArray);
        System.out.println();
        System.out.println("Minimum: " + printMin(intArray));
        System.out.println("Maximum: " + printMax(intArray));
    }

    private static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    private static int printMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int printMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
