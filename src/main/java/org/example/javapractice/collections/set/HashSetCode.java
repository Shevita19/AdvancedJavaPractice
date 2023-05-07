package org.example.javapractice.collections.set;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetCode {
    public static void main(String[] args) {

        HashSet<Double> hset = new HashSet<>();

        hset.add(12.24);
        hset.add(22.2);
        hset.add(58.6);
        hset.add(6.7);
        hset.add(8.9);
        hset.add(22.2);    // duplicated are not allowed and even order is not preserved.
        System.out.println(hset);

        // to remove element
        hset.remove(58.6);
        System.out.println(hset);

        //to print size of hastSet / no. of elements

        System.out.println("size of hashSet is : " + hset.size() );

        //check if element exists
        if (hset.contains(22.2)) {
            System.out.println("haset has 22.2");
        } else{
            System.out.println("22.2 not present");
        }

        // for-each loop is used to print out each element in the HashSet.
        for (Double num: hset){
            System.out.println(num);
        }

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(hset);
        System.out.println(tset);    // all elements will be sorted as order is preserved in treeSet.
    }
}
