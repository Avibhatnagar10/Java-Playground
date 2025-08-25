package com.Functions;

public class Scope {
    public static void main(String[] args) {
//         int a= 10;
//         i>nt b= 20;
         int ans = sum(10,20);
        System.out.println(ans);

        {
            int a = 43;

        }

    }

    static  int sum(int a,int b){
        int add = a+b;
        System.out.println(add  );
        return add;
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //this change is only valid in this function scope only
    }

}
