package com.Conditionals_Loops;

import java.util.Scanner;

public class Restaurant_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thank You, Visiting Our Restaurant!");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("Please Enter you Bill Amount: ");
            double amount = sc.nextDouble();
            double  finalAmount;
        if(amount>=2000){
            finalAmount = amount - (0.20*amount);
            System.out.println("Wohoo! We got you 20% Discount!");
            System.out.println("Your total Bill is " + finalAmount);
        }else if (amount>=1000 & amount<2000){
            finalAmount = amount - (0.10*amount);
            System.out.println("Wohoo! We got you 10% Discount!");
            System.out.println("Your total Bill is " + finalAmount);

        }
        else{
            System.out.println("Sorry! You got No Discount!");
            System.out.println("Your total Bill is " + amount);
        }
        sc.close();

    }
}
