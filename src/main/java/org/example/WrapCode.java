package org.example;

public class WrapCode {
    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(5);
        Integer i2= Integer.valueOf("10");

        Float f1 = Float.valueOf(3.14f);


        //The valueOf() method of the Integer class can accept a String as an argument and parse it to an int.
        // So when we call Integer.valueOf("10"), it creates an Integer object with a value of 10, equivalent
        // to Integer.valueOf(10). This is known as autoboxing, where a primitive type (in this case, int) is
        // automatically converted to its corresponding object wrapper class (in this case, Integer).

        System.out.println("i1= " + i1 + ", i2= " + i2 + ", f1= " + f1 );
        System.out.println("Size of int object (in bytes): " + sizeOf(i1)) ;

    }

    //public  static int sizeOf(Integer obj) {
      //  return Integer.BYTES;

    // you can use a generic method that works for any primitive type wrapper class. This code uses a generic method that takes an object of any type (<T>)
    // and returns the size of the object in bytes.
    // Inside the method, it checks the type of the object using the instanceof operator and returns the appropriate size based on the type.
    // If the object is of an unsupported type, it throws an IllegalArgumentException.
    public static  <T> int sizeOf (T obj){
        if (obj instanceof Integer){
            return Integer.BYTES;
        } else if (obj instanceof  Float){
            return Float.BYTES;
            
        }
        else {
            throw new IllegalArgumentException("unsupported type: " + obj.getClass().getName());
        }

    }


}
