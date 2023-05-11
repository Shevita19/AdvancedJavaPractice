package org.example.javapractice.collections.map;

import java.util.HashMap;
import java.util.HashSet;

public class mapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> courses = new HashMap<>();
        courses.put("java", 5000);
        courses.put("python", 4000);
        courses.put("spring", 7000);
        courses.put("spring", 8000);  // duplicates not allowed, will show only one value.
        courses.put("ai", 9000);     //order is not preserved.
        System.out.println(courses);

//        courses.forEach((e1,e2) -> {
//            System.out.println(e1 +  " => " +e2);
//        });

        //or

        courses.forEach((key,value)-> {    //traversal ways
            System.out.print(key);
            System.out.print("=>");
            System.out.println(value);
            System.out.println();

        });


        //to fetch element- entry set , key set ...
        //

        System.out.println(courses.get("java"));  // to get single element
    }
}
