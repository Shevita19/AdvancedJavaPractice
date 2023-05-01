//Use of generic function - We can also write generic functions that can be called with different types of arguments
// based on the type of arguments passed to the generic method. The compiler handles each method.

package org.example.javapractice.generic;

public class GenFun {


    static <T> void genericDisplay( T element){

        System.out.println(element.getClass().getName() + " = " + element);


    }

    public static void main(String[] args) {

        genericDisplay(10);

        genericDisplay("generics");

        genericDisplay(2.0);
    }

}
