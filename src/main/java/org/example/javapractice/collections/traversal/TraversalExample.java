package org.example.javapractice.collections.traversal;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversalExample {

    public static void main(String[] args) {

    ArrayList<String> data= new ArrayList<>();

    data.add("shevita");
    data.add("surbhi");
    data.add("sharman");
    data.add("fishy");
    System.out.println(data);

    //to traverse each element
    for (String str : data){
        System.out.println(str + "\t" + str.length() +"\t");

        StringBuffer sbr= new StringBuffer(str);   //to reverse
        System.out.println(sbr.reverse());
    }

    //traversing using Iterator forward traversal
        //data.iterator();    // to fetch iterator object as collection has its object
        Iterator<String> itr = data.iterator();
        while(itr.hasNext()){
        String next = itr.next();   //itr.next();
        System.out.println(next);
    }

        System.out.println("++++");

    //backward traversal of Collection List Iterator
        ListIterator<String> litr = data.listIterator(data.size());  //need to pass size also for backward iteration
        while(litr.hasPrevious()){
            String previous = litr.previous();
            System.out.println(previous);

        }


        //Enumeration pending

        System.out.println("++++ for each method");
        //forEach method, we can use anything instead of e
        data.forEach(e -> {
            System.out.println(e);

        });

        //consumer is a func interface



    }}
