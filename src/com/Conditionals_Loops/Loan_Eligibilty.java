package com.Conditionals_Loops;

import java.util.Scanner;

public class Loan_Eligibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! Please enter your Salary & Credit Score");
        System.out.print("Salary: ");
        float sal = sc.nextFloat();
        System.out.print("Credit Score: ");
        int cred = sc.nextInt();

        System.out.println("Our System checking if your Loan can be approved or not");
        System.out.println("Processing...");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if(sal>=25000 && cred>=700){
            System.out.println("Hey, Your Loan is Successfully Approved!");
            System.out.println("Congratulations! 🎉");
        }else{
            System.out.println("Sorry, Your Loan is not Approved! 😔");
            System.out.println("Either Your Salary or Your Credit score does not meet criteria! ");
        }
           sc.close();
    }
}
