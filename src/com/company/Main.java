package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

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

        HashMapClass phoneBook1 = new HashMapClass();
        phoneBook1.addEntry("Alice", "703-493-1834");
        phoneBook1.addEntry("Bob", "857-384-1234");
        phoneBook1.addEntry("Elizabeth", "484-584-2923");

        phoneBook1.printEntry("Elizabeth");
        phoneBook1.addEntry("Kareem", "938-489-1234");
        phoneBook1.removeEntry("Alice");
        phoneBook1.changeEntry("Bob", "968-345-2345");

        phoneBook1.printPhoneBook();





    }
}
