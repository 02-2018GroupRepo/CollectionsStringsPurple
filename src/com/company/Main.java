package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        //Exercise 1 - Print Sum
        int arr1[] = {12, 23, 34, 45, 56, 67, 78, 89};
        ArrayClass arr = new ArrayClass();
        arr.printArraySum(arr1);

        ArrayListClass arrList1 = new ArrayListClass();
        ArrayListClass arrList2 = new ArrayListClass();

        //Utilizes try with resources buffer reader
        try (BufferedReader console =
                     new BufferedReader(new InputStreamReader(System.in))) {

            //Exercise 2 - Print Largest Number
            arrList1.createArrayList(console);
            arrList1.printLarge();

            //Exercise 3 - Print positive number array list.
            arrList2.createArrayList(console);
            arrList2.printPositive();

        } catch (Exception e) {
            System.out.println(e);
        }

        //Exercise 4 - HashMap

    }
}
