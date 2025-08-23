package com.Conditionals_Loops;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many terms you want in Fibonacci Series: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series up to " + n +" is: ");
        for (int i = 1; i <=n ; i++) {
            System.out.println(first + " ");
            int next = first+second;
            first=second;
            second = next;
        }
        sc.close();
    }
}
