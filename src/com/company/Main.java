package com.company;

public class Main {

    public static void main(String[] args) {
        int arr1[] = {12, 23, 34, 45, 56, 67, 78, 89};
        ArrayClass arr = new ArrayClass();
        arr.printArraySum(arr1);

        ArrayListClass arrList = new ArrayListClass();
        arrList.createArrayList();
        arrList.printLarge();
        arrList.printPostive();
    }
}
