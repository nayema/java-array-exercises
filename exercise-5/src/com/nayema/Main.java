package com.nayema;

public class Main {

    public static boolean contains(int[] numbers, int item) {
        for (int n : numbers) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {2001, 2002, 2003, 2004, 2005, 2006};

        System.out.println(contains(array1, 2003));
        System.out.println(contains(array1, 2008));
    }
}
