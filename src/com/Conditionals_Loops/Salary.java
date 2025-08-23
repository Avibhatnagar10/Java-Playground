package com.Conditionals_Loops;

import java.util.Scanner;

 class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter you salary: ");
        float salary = sc.nextFloat();
        float bonus;
        if(salary>10000){
            bonus = 5000;
        }
            else {
                bonus=1000;
            }
            salary += bonus;
        System.out.println("Congrats! You got a bonus: " + bonus);
        System.out.println("Your final salary is: " + salary);
        sc.close();
    }
}
