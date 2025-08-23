package com.Functions;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Please Greet!");
Greeting();
    }
    static void Greeting(){
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine().trim();

        if(user.equalsIgnoreCase("good morning")){
            System.out.println("Hey, A very Good Morning!");
        }
        else if(user.equalsIgnoreCase("good afternoon")){
            System.out.println("Hey, Good Afternoon!");
        }
        else if(user.equalsIgnoreCase("good evening")){
            System.out.println("hey, Good Evening...Hope your day spent well");
        }
        else {
            System.out.println("This is not correct way to greet");
        }
        sc.close();
    }

}
