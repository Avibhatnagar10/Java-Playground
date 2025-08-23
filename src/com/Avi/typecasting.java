package com.Avi;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Float Number: ");
//         float num = sc.nextFloat();
//        System.out.println(num);
//        //An integer cannot be converted directly into Float as float(Int + decimal) is greater than integer
//        //type casting
//        int num1 = (int) (3432.3f);   //converting an int to float
//        System.out.println(num1);
//
//        //automatic type conversion in expression

//        int a = 562;
//        byte b = (byte) (a);
//        System.out.println(b);
          //int can store much larger numbers than byte
        byte a = (byte)545;
        byte b = (byte)545;
        byte c = 10;
        int num = (a+b)/c;
        System.out.println(num);
    }
   }
