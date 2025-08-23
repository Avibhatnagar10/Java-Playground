package com.Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99; //if you make a change to an object via this ref variable, the same object will be changed.
    }
}
