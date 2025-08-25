package com.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,3,7,10,43,65,25,57,24);
        mutilple(1,2,76,"Avi", "BMW", "Atlassian", "Asus TUF", "Redragon");
    }

    static void mutilple(int a, int b, int c, String ...v){
        System.out.println("a = " +a+",b = " +b+",c = " +c);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){ //you can take here n number of arguments
        System.out.println(Arrays.toString(v));
    }
}
