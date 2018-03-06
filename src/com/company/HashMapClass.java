package com.company;

import java.util.Map;
import java.util.HashMap;

public class HashMapClass {

    private Map<String, String> phoneBook = new HashMap<String, String>();

    public void addEntry (String name, String phoneNumber) {

        phoneBook.put (name, phoneNumber);

    }

    public void removeEntry (String name) {

        phoneBook.remove(name);
    }

    public void changeEntry (String name, String phoneNumber){

        phoneBook.replace(name, phoneNumber);
    }

    public void printEntry (String name) {

        System.out.println(name + " = " + phoneBook.get(name));
    }

    public void printPhoneBook (){

        System.out.println(phoneBook);





    }



}
