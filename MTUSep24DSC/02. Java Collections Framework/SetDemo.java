// package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("John");
        names.add("Romeo"); //Why is Romeo entered first but displayed last
        names.add("Diana");
        names.add("Tom");
        names.add("Harry");
        names.add("Tom");// will not be added, duplicates not allowed

        names.add("Laura");// even tho the Hash set ignores the duplicate it still moves onto the next item to check if it is there or not
       
        /*if (names.contains("Diana"))
            System.out.println("We are in the presence of Royalty: Diana is in the list \n\n");//expect this
        else
            System.out.println("Diana not in the list \n\n");*/
        //Check if my name is there
        if (names.contains("Laura"))
            System.out.println("Laura is in the list");//expect this
        else
            System.out.println("Missing Report: Laura is not in the list");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            // Do something with name
            System.out.println(name);
        }
        System.out.println("The number of names in the list is: " +names.size());

        names.remove("Laura");
        System.out.println("\nList after Laura was removed:");
        System.out.println( names); //Display list after Laura was removed
        System.out.println("The number of names in the list is: " +names.size());

        if (names.contains("Laura"))
        System.out.println("Laura is in the list");
        else
        System.out.println("Missing Report: Laura is not in the list");//expect this

    }
}