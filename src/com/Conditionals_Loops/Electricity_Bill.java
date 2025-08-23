package com.Conditionals_Loops;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        System.out.print("Hey, Please enter the Units Consumed: ");
        Scanner sc = new Scanner(System.in);
        float units = sc.nextFloat();
        float price;
        if(units<=100){
            System.out.println("Oh, You've consumed less than 100 Units!");
            price = units*5;
        }
        else if (units<=200) {
            System.out.println("Oh, You've consumed more than 100 Units!");
            price = units*7;
        }
        else{
            System.out.println("Oh, You've consumed more than 200 Units!");
            price = units*10;
        }

        System.out.println("Your Total Bill Amount is: " + price);
        sc.close();
    }
}
