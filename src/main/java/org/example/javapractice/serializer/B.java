// Serialization and Deserialization Implementation

package org.example.javapractice.serializer;
import java.io.*;

    class A implements Serializable {

    @Serial
        private static final long serialVersionUID = 1L;


        public static long getSerialVersionUID(){
            return serialVersionUID;
     }
        public int age;
        //public String name;

        transient  String name;       // This means that the name field will not be serialized, and its value will not be saved when an object of class A is written to a file.


        public A(int age, String name) {
        this.age = age;
        this.name = name;

    }

}
    public class B extends A {

        public B(int age, String name) {   //You can use the super keyword to call the constructor of the superclass A in the constructor of the subclass B.
            super(age, name);
        }

        public static void main(String[] args) throws IOException, ClassNotFoundException {

            System.out.println("The serialVersionUID for class A is: " + A.getSerialVersionUID());



            // Serialization
        try{
            A obj= new A(20, "Shweta");
            String filename= "Demo.txt";

            //Saving/writing object in a file
            FileOutputStream file= new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(obj);
            out.close();
            file.close();

            System.out.println("Object has been serialised : age = "  + obj.age + ", name = " + obj.name);


        } catch (IOException e) {
            System.out.println("IO Exception is caught");
        }

        try {
            String filename = "Demo.txt";

            //Reading object from a file.

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Casting the deserialized object to class A

            A obj = (A) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized: age = " + obj.age + ", name = " + obj.name);

        } catch (IOException e) {
                System.out.println("IOException is caught");
            } catch (ClassNotFoundException e) {
                System.out.println("ClassNotFoundException is caught");
            }

        }
}
