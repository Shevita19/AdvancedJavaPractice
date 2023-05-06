package org.example.javapractice.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListPractice {
    public static void main(String[] args) {

        /* creating collections- 2 ways :
        1. Type Safe - same type of elements are added to collection
        2. Un type Safe- different types of elements can be added to collection.
        */

        //Type Safe generic (specify type) way of creating collection
        ArrayList <String> names= new ArrayList<>();
        names.add("shweta");
        names.add("surbhi");
        names.add("sharman");
        names.add("shwetaa");

        System.out.println(names);
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        //remove an element using object and index
//        names.remove("shwetaa");
//        names.remove(0);
//        System.out.println(names);

        //size

        System.out.println("size=  " + names.size());

        //check item is there or not
        System.out.println(names.contains("surbhi"));

        //check for empty
        System.out.println(names.isEmpty());

        //setting value 2 ways:
        names.set(0, "Ruchit");   // set will replace the element at given index.
        System.out.println(names);

        names.add(4, "shevita");   //add will shift the element at from  given index and add given element in that index
        System.out.println(names);

        //remove all elements
//        names.clear();
//        System.out.println(names);


        // creating vector

        Vector <String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println("Vector is : " + vector);




//        //un type Safe
//        LinkedList list = new LinkedList<>();
//        list.add("soi");
//        list.add(3);
//        list.add(12.5);
//        list.add(true);
//        System.out.println(list);
//        System.out.println(list.get(1));

    }
}
