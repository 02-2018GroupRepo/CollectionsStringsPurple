package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class ArrayListClass {
    private List<Integer> userArrayList = new ArrayList<Integer>();


    public void createArrayList() {

        //try with resources buffered reader
        //don't need the finally block that closed buffered reader


        try (BufferedReader console =
                     new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please enter seven numbers: ");

            while(userArrayList.size() < 7) {
                String input = console.readLine();
                Integer count = Integer.valueOf(input);
                userArrayList.add(count);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int printLarge() {
        int largestNumber = 0;
        for (int currentNumber: userArrayList) {
            if (largestNumber < currentNumber) {
                largestNumber = currentNumber;
            }
        }
        System.out.println("The largest number is " + largestNumber);
        return largestNumber;
    }

    public void printPostive() {
        List<Integer> positiveArrayList = new ArrayList<Integer>();
        for (int currentNumber: userArrayList) {
            if (currentNumber > 0) {
                positiveArrayList.add(currentNumber);
            }
        }
        System.out.println("Your positive numbers are: " + positiveArrayList);
    }
}
