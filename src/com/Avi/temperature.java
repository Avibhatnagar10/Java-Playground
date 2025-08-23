package com.Avi;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in C: ");
        float temp = sc.nextFloat();
        float temp1 = (temp * 9/5 ) +32;
        System.out.println("The temperature in F is: " + temp1);
    }
}
