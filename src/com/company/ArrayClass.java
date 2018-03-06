package com.company;

public class ArrayClass {
//    private int userArray[];
//
//    public ArrayClass(int[] userArray) {
//        this.userArray = userArray;
//    }

    public void printArraySum(int[] userArray) {
        int sum = 0;
        for (int number: userArray) {
            sum += number;
        }
        System.out.println("The sum of your numbers is " + sum);
    }
}
