package com.Functions;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int[] swapped = swap(a, b); // call swap
        a = swapped[0];
        b = swapped[1];

        System.out.println("a: " + a + " b: " + b);
//        System.out.println(swap1(10,20));   //for swap1() function
    }

    static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b}; // return swapped values
    }

    static String swap1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return "a: " + a + " b: " + b;
    }
}
