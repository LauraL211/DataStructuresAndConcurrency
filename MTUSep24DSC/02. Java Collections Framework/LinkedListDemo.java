// package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class.
*/
public class LinkedListDemo
{  
   public static void main(String[] args)
   {
      LinkedList<String> internships = new LinkedList<>();
      internships.add("JRI"); // JRI only in list
      internships.add("Fexco"); // JRI, Fexco
      internships.add("Xintec"); // JRI, Fexco, Xintec
      internships.addLast("Continuum"); // JRI, Fexco, Xintec, Continuum(added last)
      internships.addFirst("Aspen Grove"); // Aspen Grove(added first) JRI, Fexco, Xintec, Continuum
      internships.add("Dell"); //  Aspen Grove, JRI, Fexco, Xintec, Continuum(added last), Dell(added after Continuum)
      System.out.println("Current internships available:" + internships);

      String internship1 = internships.getFirst();
      System.out.println("First in the list:" + internship1); //showing what is first in the list

      String internship2 = internships.getLast();
      System.out.println("Last in the list:" + internship2); //showing what is last in the list

      //Turns out Fexco already filled their placements, so it must be removed from the list
      ListIterator<String> iterator = internships.listIterator();
      iterator.next();
      iterator.next();
      iterator.next();
      iterator.remove();
      System.out.println("Current internships available:" + internships + '\n');

      //trying to remove an item in the for loop causes errors
      for (String s : internships){
         System.out.println(s+"...");
         //internships.remove(s);
      }

      //using iterator to process the contents of a linked list
      //trying to remove items from the array works easier
      System.out.println("Internships available before iterator:" + internships + '\n');
      iterator = internships.listIterator();
      while (iterator.hasNext()){
         String name = iterator.next();
         System.out.println(name+"...");
         iterator.remove();
      }
      System.out.println("Internships available after iterator: " + internships + '\n');

      System.out.println('\n');

      LinkedList<String> staff = new LinkedList<String>();
      staff.addLast("Diana");
      staff.addLast("Harry");
      staff.addLast("Romeo");
      staff.addLast("Tom"); //DHRT

      staff.addFirst("Sam");//SDHRT
 
      String name1 = staff.getFirst();//S
      String name2 = staff.getLast();//T
      staff.removeFirst();//DHRT
      
      // | in the comments indicates the iterator position

      ListIterator<String> iterator1 = staff.listIterator(); // |DHRT
      iterator1.next(); // D|HRT
      iterator1.next(); // DH|RT

      // Add more elements after second element
      
      iterator1.add("Juliet"); // DHJ|RT
      iterator1.add("Nina"); // DHJN|RT

      iterator1.next(); // DHJNR|T

      // Remove last traversed element 

      iterator1.remove(); // DHJN|T
     
      // Print all elements

      System.out.println(name1);
      System.out.println(name2);
      System.out.println(staff);
      System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
      // Process all the elements

      //using iterator to process the contents of a linked list
      iterator1 = staff.listIterator();
      while (iterator1.hasNext()){
         String name = iterator1.next();
         System.out.println(name+"...");
      }

      System.out.println("\n");
      //the enhanced for loop uses an iterator behind the scenes
      for (String s : staff){
         System.out.println(s+"---");
      }
   }
}
