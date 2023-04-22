package org.example.genericPractice;

public class GenericReuse {

   // public  static  <T> void printArray (T [] arr)
    // if we make it static as static method is associated with class rather than it's instance
    // we can not call it using instance of intArr etc

    public  <T> void printArray (T [] arr){
        for (T element : arr ){
            System.out.println( element + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};
        String[] strArr = {"shweta", "surbhi", "sharman"};
        Double[] dblArr = {1.1, 2.1, 3.1};


        //System.out.println(" Integer Array : ");
       // GenericReuse.printArray(intArr);    //you cannot call the printArray method on an instance of the Integer array (intArr), since it is not an instance method of the array
       // printArray(intArr);
       // System.out.println(" String Array : ");
        //printArray(strArr);
        //System.out.println(" Double array : ");


        // made generic method non-static  - In this modified code, the printArray method is non-static, so we need to create an instance of the GenericReuse
        // class before calling it. This is done in the main method using the new keyword:

        GenericReuse obj = new GenericReuse();

        System.out.println("Integer Array : ");
        obj.printArray(intArr);      // After creating an instance of the class, we can call the printArray method on the instance, like this:

        System.out.println("String Array : ");
        obj.printArray(strArr);

        System.out.println("Double Array : ");
        obj.printArray(dblArr);


    }
}
