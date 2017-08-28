package com.nayema;

public class Main {

    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 5, 5, 7, 7, 8, 8, 9};
        int[] intArray2 = {2, 2, 5, 6, 7, 8, 9, 9, 10};

        printDuplicateInArray(intArray1);
        printDuplicateInArray(intArray2);
        printDuplicateBetweenArrays(intArray1, intArray2);
    }

    private static void printDuplicateInArray(int[] array) {
        System.out.print("Duplicate Element within array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.print(array[j] + " ");
                }
            }
        }
        System.out.println();
    }

    private static void printDuplicateBetweenArrays(int[] array1, int[] array2) {
        System.out.print("Common elements between array1 and array2: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == (array2[j])) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
