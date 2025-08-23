package com.Functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();   // call method
        String message = myGreet("Avi");
        System.out.println(message); // print final result
    }

    static String myGreet(String name){
//
        return ("Hey," + name+ " How are you doing?");
    }




    static String greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your greeting: ");
        String greeting = sc.nextLine();

        if (greeting.equalsIgnoreCase("hello")) {
            return "Hello Avi!";
        } else {
            return "Hi there!";
        }
    }
}
