package com.Conditionals_Loops;

import java.util.Scanner;

public class ATM_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float balance = 0.0f;
        String choice;
        do {

            System.out.println("Welcome to the Bank!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("What would you like to do today?");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter you choice: ");
            try {
                choice= sc.nextLine().toLowerCase();
            }catch (StringIndexOutOfBoundsException e) {
                choice = " ";
            }
            switch (choice) {
                case "1":
                case "deposit":
                    System.out.println("Enter the Amount you want to Deposit: ");
                    float deposit = sc.nextFloat();
                    sc.nextLine();
                    if(deposit>0) {
                        balance += deposit;
                        System.out.println("Successfully Deposited: " + deposit);
                    }
                    else{
                        System.out.println("⚠ Sorry!Deposit Should be Greater than Zero!");
                    }
                break;
                case"2":
                case "withdraw":
                    System.out.println("Enter the Amount to Withdraw: ");
                    float withdraw =  sc.nextFloat();
                    sc.nextLine();
                    if(withdraw>0 && withdraw <= balance){
                        balance -= withdraw;
                        System.out.println("Yo! You have Successfully withdrawn the Amount: " + withdraw);
                        System.out.println("Your Current Balance is :" + balance);
                    }else {
                        System.out.println(" ⚠ Invalid amount or insufficient Balance!");
                    }
                    break;
                case"3":
                case "check balance":
                    System.out.println("Your Current Balance is :" + balance);
                    break;
                case "4":
                case "exit":
                    System.out.println("Thanks for Using our Services!");
                    break;
                default:
                    System.out.println("⚠ Invalid choice! Please try again.");
            }
        } while(!choice.equals("4") && !choice.equalsIgnoreCase("exit"));
        sc.close();
    }
    }

