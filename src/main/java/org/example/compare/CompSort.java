
package org.example.compare;

import java.util.ArrayList;
import java.util.Collections;

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
    }


}
