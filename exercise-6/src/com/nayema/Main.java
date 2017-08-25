package com.nayema;

public class Main {
    public static int findIndex(int[] numbers, int arrayElement){
        if (numbers == null) return -1;

        int length = numbers.length;
        int i = 0;
        while (i < length) {
            if (numbers[i] == arrayElement) return i;
            else i = i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9};

        System.out.println(findIndex(intArray, 3));
        System.out.println(findIndex(intArray, 70));
    }
}
