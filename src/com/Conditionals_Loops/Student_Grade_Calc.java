package com.Conditionals_Loops;

import java.util.Scanner;

public class Student_Grade_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! pls enter the marks of 5 subjects!");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("English: ");
        float eng = sc.nextFloat();
        System.out.print("Hindi: ");
        float hind = sc.nextFloat();
        System.out.print("Math: ");
        float math = sc.nextFloat();
        System.out.print("Science: ");
        float sci = sc.nextFloat();
        System.out.print("French: ");
        float fre = sc.nextFloat();

        float avg =  (eng + hind + math + sci + fre) / 5;
        if (avg >= 90) {
                System.out.println("Grade: A");
        }
              else if(avg>=75) {
            System.out.println("Grade: B");
        }
               else if(avg>=50) {
            System.out.println("Grade: C");
        }
            else if(avg>=35) {
            System.out.println("Grade: D");
        }
              else if(avg<35) {
            System.out.println("Fail");
        }
            else {
            System.out.println("Invalid Number!");
        }
        System.out.println("Average Marks: " + avg);
    }
}
