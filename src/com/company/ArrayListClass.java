package com.company;

import java.io.BufferedReader;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayListClass {
    private List<Integer> userArrayList = new ArrayList<Integer>();



    public void createArrayList(BufferedReader console) {
        System.out.println("Please enter seven numbers: ");
        while(userArrayList.size() < 7){
            try {
                String input = console.readLine();
                int value = Integer.valueOf(input);
                userArrayList.add(value);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public int printLarge() {
        int lrgNumber = Collections.max(userArrayList);
        System.out.println("The largest number is " + lrgNumber);
        return lrgNumber;
    }



    public void printPositive() {
        List<Integer> positiveArrayList = new ArrayList<Integer>();
        for (int currentNumber: userArrayList) {
            if (currentNumber > 0) {
                positiveArrayList.add(currentNumber);
            }
        }
        System.out.println("Your positive numbers are: " + positiveArrayList);

    }
}
