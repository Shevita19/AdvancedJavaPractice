//No need to typecast

package org.example.genericPractice;
import java.util.ArrayList;

public class GenericTypeCast {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();

        al.add("hi");
        al.add("hello");



        String s1 = al.get(0);  ////The get() method is then used to retrieve the elements at index 0 and index 1 of the ArrayList.
        String s2 = al.get(1);
        //String s3 = al.get(3);

        System.out.println(s1);
        System.out.println(s2);
       // System.out.println(s3);


        // Since the ArrayList was declared as an ArrayList<String>, no typecasting is needed when assigning the returned values to String variables s1 and s2.
    }
}

