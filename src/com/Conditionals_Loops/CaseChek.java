package com.Conditionals_Loops;

import java.util.Scanner;

public class CaseChek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Type 'exit' to quit the program");
            String input = sc.next().trim();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Exiting program...");
                break;
            }

            char ch = input.charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lowercase");
            } else {
                System.out.println("Uppercase");
            }
            System.out.println(ch);
        }
    }
}
