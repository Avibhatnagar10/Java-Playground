package com.Functions;

public class passingExample {
    public static void main(String[] args) {
        String name = ChangeName("Avi Bhatnagar");
        System.out.println(name);
    }
    static String ChangeName(String naam){
        naam = "Batman"; //here we are creating a new object which does not make any changes
        return naam;
    }
  //there is no pass by reference
    //name is reference variable, and copy of this variable is passed
    //Identity is also a copy of reference variable that's why it will point towards the same object.4
    //Avi Bhatnagar is an object here.
}
