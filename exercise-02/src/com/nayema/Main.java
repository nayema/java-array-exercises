package com.nayema;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {2, 3, 5, 7, 8};

        int sum = 0;

        for (int a : intArray) {
            sum += a;
        }
        System.out.println("The sum is: " + sum);
    }
}
