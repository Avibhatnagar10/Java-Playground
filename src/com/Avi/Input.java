package com.Avi;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //Scanner is a class
        //new keyword is to create  object of a class
        //sc is a reference variable
//        System.out.print("Enter First Number: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter Second Number: ");
//        int b = sc.nextInt();
//
//        int num = a+b;
//
//        System.out.println("The Value is: " + num);

        System.out.print("Enter your friend Name: ");
        String a = sc.nextLine();

        System.out.print("Enter your second Friend Name: ");
        String b= sc.nextLine();


        System.out.println("Your Friends are " +a +" & " + b);

        sc.close();



    }
}
