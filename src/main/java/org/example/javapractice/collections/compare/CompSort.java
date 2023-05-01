
package org.example.javapractice.collections.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSort {

    public static void main(String[] args) {

        ArrayList <Integer> marks =  new ArrayList <> ();
        marks.add(10);
        marks.add(4);
        marks.add(60);
        marks.add(7);

        System.out.println(marks);

        Collections.sort(marks);

        System.out.println(marks);


        List<Employee> employeelist = new ArrayList<>();
        Collections.sort(employeelist);

    }



}
