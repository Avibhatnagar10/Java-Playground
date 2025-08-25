package com.Functions;
//function overloading means one or more same function name can exist if parameters are different
public class overloading {
    public static void main(String[] args) {
        fun(1, 3);                   // calls int version
        fun("Avi", "Bhatnagar");     // calls String version
    }

    static void fun(int a, int b) {
        System.out.println(a + b);
    }

    static void fun(String c, String d) {
        System.out.println(c+" "+d);  // prints empty line
    }
}
