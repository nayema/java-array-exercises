package com.nayema;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        int sum = 0;
        for (int a : intArray) {
            sum += a;
        }
        int average = sum / intArray.length;

        System.out.println("The Average of the values is: " + average);
    }
}
