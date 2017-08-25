package com.nayema;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int sum = 0;
        for (int a : numbers) {
            sum += a;
        }

        int average = sum / numbers.length;
        System.out.println("The Average of the values is: " + average);
    }
}
