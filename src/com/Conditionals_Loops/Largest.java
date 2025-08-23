package com.Conditionals_Loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

        int max = Math.max(c, Math.max(a,b));
        System.out.println("Largest Number is: " + max);
    }
}
