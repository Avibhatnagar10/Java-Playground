package com.Functions;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Armstrong Number:");
//        int n = sc.nextInt();
        for(int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
//        Boolean ans = isArmstrong(n);
//        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
        int orginal =n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if(sum == orginal){
            return true;
        }
        return false;
    }
}
