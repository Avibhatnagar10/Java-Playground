package com.Functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum3(2,3 );
        System.out.println("Answer Is:"+ans);

    }
    //pass the value of numbers when you are calling the method in main
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
    //return the value
  static int sum2(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      System.out.print("NUmber 1:");
      int a = sc.nextInt();
      System.out.print("NUmber 2:");
      int b = sc.nextInt();
      int add = a+b;
//      System.out.println(add);
      return add;

  };

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        System.out.print("NUmber 1:");
        int a = sc.nextInt();
        System.out.print("NUmber 2:");
        int b = sc.nextInt();
        int add = a+b;
        System.out.println("The Addition is:" + add);

    }
}
