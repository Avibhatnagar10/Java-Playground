package com.Conditionals_Loops;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter the Operator (+, -, *, /, %, x to exit): ");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting Calculator...");
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter num1: ");
                int num1 = sc.nextInt();
                System.out.print("Enter num2: ");
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                else if (op == '-') {
                    ans = num1 - num2;
                }
                else if (op == '*') {
                    ans = num1 * num2;
                }
                else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                }
                else if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Error: Modulo by zero!");
                        continue;
                    }
                }

                System.out.println("Answer = " + ans);
            }
            else {
                System.out.println("Invalid Operation");
            }
        }

        sc.close();
    }
}
